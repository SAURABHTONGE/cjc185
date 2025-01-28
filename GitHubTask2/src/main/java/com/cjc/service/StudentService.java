package com.cjc.service;


import java.util.List;

import com.cjc.model.Student;

public interface StudentService {

	void dataStudent(Student s);

	void deleteById(int id);

	void deleteAll();


	public Student updateById(Student s, int id);

	public Student updateStudent(Student s);

<<<<<<< HEAD
=======
	public List<Student> getall();

	public Student getsingle(int id);

	
>>>>>>> branch 'main' of https://github.com/SAURABHTONGE/cjc185.git

}
