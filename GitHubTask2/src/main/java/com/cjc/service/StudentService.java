package com.cjc.service;

import java.util.List;

import com.cjc.model.Student;

public interface StudentService {

	void dataStudent(Student s);

	void deleteById(int id);

	void deleteAll();

<<<<<<< HEAD
	public List<Student> getallstudent();

	public Student getsingle(int id);
=======
	Student updateById(Student s, int id);
>>>>>>> branch 'main' of https://github.com/SAURABHTONGE/cjc185.git

}
