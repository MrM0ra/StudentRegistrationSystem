import React, { useEffect, useState } from 'react'

export default function StudentForm() {
    const [studentName, setStudentName] = useState("");
    const [address, setAddress] = useState("");
    const [students, setStudents] = useState([]);
    const divStyle={ display: "grid",
        justifyContent: "center",
    };
    const handleClick = (e) => {
        e.preventDefault()
        const student = {studentName,address}
        console.log(student)
        fetch("http://localhost:8081/student/add", {
            method:"POST",
            headers: {"Content-Type":"application/json"},
            body:JSON.stringify(student)
        }).then( () => {
            console.log("New student added")
        })
    }
    useEffect( () => {
        fetch("http://localhost:8081/student/getAll")
        .then(res => res.json())
        .then((result) => {
            setStudents(result);
        }
        )},[])
    return (
        <div style={divStyle}>
            <h1>Add students</h1>
            <div>
                <form style={divStyle}>
                    <input type="text" placeholder="Student name" id="name" value={studentName} onChange={(e)=>setStudentName(e.target.value)}></input>
                    <input type="text" placeholder="Student address" id="address" value={address} onChange={(e)=>setAddress(e.target.value)}></input>
                    <input type="submit" id="btn" value="submit" onClick={handleClick}></input>
                </form>
            </div>
            <h1>Students</h1>
            <div>
                <table>
                    <thead>
                        <th>ID</th>
                        <th>NAME</th>
                        <th>ADDRESS</th>
                    </thead>
                    <tbody>
                    {students.map(student => (
                    <tr key={student.id}>
                        <td>{student.id}</td>
                        <td>{student.studentName}</td>
                        <td>{student.address}</td>
                    </tr>
                ))}                        
                    </tbody>
                </table>
            </div>
        </div>
    )
}
