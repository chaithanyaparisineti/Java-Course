package com.student.StudentManagement.controller;

import com.student.StudentManagement.entity.student;
import com.student.StudentManagement.entity.student;
import com.student.StudentManagement.repository.studentRepository;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class studentController {

    private final studentRepository studentRepository;

    public studentController(studentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @PostMapping
    public student addStudent(@RequestBody student student) {
        return studentRepository.save(student);
    }

    @GetMapping
    public List<student> getAllStudents() {
        return studentRepository.findAll();
    }
}