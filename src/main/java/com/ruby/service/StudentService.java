package com.ruby.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ruby.bean.StudentBean;
import com.ruby.entity.Student;
import com.ruby.repository.StudentRepository;
@Service
public class StudentService {
	@Autowired
StudentRepository repo;

public Student insert(StudentBean bean) {
	Student entity=new Student();
entity.setFname(bean.getFname());
entity.setLname(bean.getLname());
repo.save(entity);
	return entity;
}
public Student delete(StudentBean bean) {
	Student entity=new Student();
	entity.setId(bean.getId());
	repo.delete(entity);
	return entity;
}

}
