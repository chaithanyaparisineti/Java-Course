package com.student.StudentManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.StudentManagement.entity.student;

public interface studentRepository extends JpaRepository<student,Integer> {

}
