package com.rujul.gradesubmission.repository;

import org.springframework.data.repository.CrudRepository;

import com.rujul.gradesubmission.entity.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {

}
