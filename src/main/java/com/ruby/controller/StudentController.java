package com.ruby.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ruby.bean.StudentBean;
import com.ruby.service.StudentService;


@RestController
public class StudentController {
@Autowired
	StudentService service;
@RequestMapping(value="/api/student/create",method=RequestMethod.POST,consumes="application/json" ,produces="application/json")	
public StudentBean insert(@RequestBody StudentBean bean) {
	service.insert(bean);
	return bean;
}
@RequestMapping(value="/api/student/delete/{id}",method=RequestMethod.DELETE)
public StudentBean delete(@PathVariable ("id") int id,StudentBean bean ) {
	
	service.delete(bean);
	return bean;
}
	
}
