package com.rujul.gradesubmission.service;

import java.util.List;

import com.rujul.gradesubmission.entity.Student;

public interface StudentService {
    Student getStudent(Long id);
    Student saveStudent(Student student);
    void deleteStudent(Long id);
    List<Student> getStudents();
}
