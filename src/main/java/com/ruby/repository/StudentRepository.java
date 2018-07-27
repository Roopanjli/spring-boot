package com.ruby.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ruby.entity.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student, String>{

}
