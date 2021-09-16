package com.MrM0ra.studentsystem.service;

import java.util.List;

import com.MrM0ra.studentsystem.model.Student;

public interface StudentServiceInterface {

	public Student saveStudent(Student student);
	public List<Student> getAllStudents();
	
}
