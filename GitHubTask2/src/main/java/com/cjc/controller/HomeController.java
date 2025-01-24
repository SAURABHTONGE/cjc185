package com.cjc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.model.Student;
import com.cjc.service.StudentService;

@RestController
public class HomeController {

	@Autowired
	StudentService si;
	
	@PostMapping("/add")
	public String addData(@RequestBody Student s) {
		si.dataStudent(s);
		return "Data Added Successfully!!";
	
	}
	
	@DeleteMapping("/deleteById")
	public String deleteById(@PathVariable int id) {
		si.deleteById(id);
		return "Deleted Student by id:"+id;
		
	}
	
	@DeleteMapping("/deleteAll")
	public String deleteAllData() {
		si.deleteAll();
		return "delete All Student Date";
	}
	
}
