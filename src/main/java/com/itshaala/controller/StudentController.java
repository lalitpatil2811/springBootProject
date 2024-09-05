package com.itshaala.controller;

import com.itshaala.model.Student;
import com.itshaala.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class StudentController {
    StudentService studentService;

    @PostMapping("/students")
    public void addStudent(@RequestBody Student student) {
        studentService.addStudent(student);
    }


    @PutMapping("/students")
    public void updateStudent(@RequestBody Student student) {
        studentService.updateStudent(student);
    }


    @DeleteMapping("/students")
    public void deleteStudent(@RequestBody Student student) {
        studentService.deleteStudent(student);
    }


    @DeleteMapping("/students/{id}")
    public void deleteStudentById(@PathVariable("id") int id) {
        studentService.deleteStudentById(id);
    }


    @GetMapping("/students")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }


    @GetMapping("/students/{id}")
    public Student getStudentById(@PathVariable("id") int id) {
        return studentService.getStudentById(id);
    }


}
