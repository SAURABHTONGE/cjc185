package com.cjc.service;

import com.cjc.model.Student;

public interface StudentService {

	void dataStudent(Student s);

	void deleteById(int id);

	void deleteAll();

}
