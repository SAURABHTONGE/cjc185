package com.cjc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.model.Student;
import com.cjc.service.StudentService;

@RestController
public class HomeController {

	@Autowired
	StudentService si;
	
	public String addData(@RequestBody Student s) {
		si.dataStudent(s);
		return "Data Added Successfully!!";
		
		
	}
}
