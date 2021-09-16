package com.MrM0ra.studentsystem.repository;

import org.springframework.data.repository.CrudRepository;
//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.MrM0ra.studentsystem.model.Student;

@Repository
public interface StudentRepo extends CrudRepository<Student, Long>{

}

