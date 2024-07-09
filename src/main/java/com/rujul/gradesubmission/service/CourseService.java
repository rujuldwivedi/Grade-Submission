package com.rujul.gradesubmission.service;

import java.util.List;

import com.rujul.gradesubmission.entity.Course;

public interface CourseService {
    Course getCourse(Long id);
    Course saveCourse(Course course);
    void deleteCourse(Long id);
    List<Course> getCourses();
}
