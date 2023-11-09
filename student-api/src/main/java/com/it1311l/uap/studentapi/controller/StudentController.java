package com.it1311l.uap.studentapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.it1311l.uap.studentapi.model.StudentInfo;
import com.it1311l.uap.studentapi.repository.StudentMybatisRepository;

@RestController
public class StudentController {
	@Autowired
	StudentMybatisRepository studentRepo;

	@PostMapping("/event/register")
	public StudentInfo info(@RequestBody StudentInfo student) {
		studentRepo.insert(student);
		return student;
	}
}
