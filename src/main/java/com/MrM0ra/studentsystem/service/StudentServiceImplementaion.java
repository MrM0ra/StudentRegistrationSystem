package com.MrM0ra.studentsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MrM0ra.studentsystem.model.Student;
import com.MrM0ra.studentsystem.repository.StudentRepo;

@Service
public class StudentServiceImplementaion implements StudentServiceInterface {

	@Autowired
	private StudentRepo studRepo;

	@Override
	public Student saveStudent(Student student) {
		studRepo.save(student);
		return student;
	}

	@Override
	public List<Student> getAllStudents(){
		return (List<Student>) studRepo.findAll();
	}
	
}
