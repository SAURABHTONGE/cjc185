package com.cjc.service;

import java.util.List;

import com.cjc.model.Student;

public interface StudentService {

	void dataStudent(Student s);

	void deleteById(int id);

	void deleteAll();

	public List<Student> getallstudent();

	public Student getsingle(int id);

	public Student updateById(Student s, int id);

	public Student updateStudent(Student s);

}
