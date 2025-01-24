package com.cjc.serviceImpl;

<<<<<<< HEAD
import java.util.List;
=======
>>>>>>> branch 'main' of https://github.com/SAURABHTONGE/cjc185.git
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.model.Student;
import com.cjc.repository.StudentRepository;
import com.cjc.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository sr;

	@Override
	public void dataStudent(Student s) {
		sr.save(s);
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		sr.deleteById(id);

	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		sr.deleteAll();

	}

	@Override
	public List<Student> getallstudent() {

		return sr.findAll();
	}

	@Override
	public Student getsingle(int id) {

		Optional<Student> op = sr.findById(id);

		if (op.isPresent()) {

			Student student = op.get();

			return student;
		}

		return null;
	}
	@Override
	public Student updateById(Student s, int id) {
		Optional<Student> byId = sr.findById(id);
		if(byId.isPresent()) {
			Student st = byId.get();
			if(s.getName()!=null) {
				st.setName(s.getName());
			}
			if(s.getAddress()!=null) {
				st.setAddress(s.getAddress());
			}
			if(s.getMobNo()!=0) {
				st.setMobNo(s.getMobNo());
			}
			if(s.getSubject()!=null) {
				st.setSubject(s.getSubject());
			}
			sr.save(st);
			return st;
		}
		return sr.save(s);
	}

}
