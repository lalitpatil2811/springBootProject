package com.itshaala.service;

import com.itshaala.dao.StudentDao;
import com.itshaala.model.Student;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor



public class StudentService {
    StudentDao studentDao;

    public void addStudent(Student student) {
        studentDao.save(student);
    }

    public void updateStudent(Student student) {
        studentDao.save(student);
    }

    public void deleteStudent(Student student) {
        studentDao.delete(student);
    }

    public void deleteStudentById(int id) {
        studentDao.deleteById(id);
    }

    public List<Student> getAllStudents() {
        return studentDao.findAll();
    }

    public Student getStudentById(int id) {
        return studentDao.findById(id).get();
    }


}
