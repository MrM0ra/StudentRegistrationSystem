package com.MrM0ra.studentsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.MrM0ra.studentsystem.model.Student;
import com.MrM0ra.studentsystem.service.StudentServiceImplementaion;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private StudentServiceImplementaion studServ;
	
	@PostMapping("/add")
	public String add(@RequestBody Student student) {
		studServ.saveStudent(student);
		return "Saved";
	}
	
	
}
