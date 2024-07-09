package com.rujul.gradesubmission;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.rujul.gradesubmission.entity.Course;
import com.rujul.gradesubmission.entity.Student;
import com.rujul.gradesubmission.repository.CourseRepository;
import com.rujul.gradesubmission.repository.GradeRepository;
import com.rujul.gradesubmission.repository.StudentRepository;

@SpringBootApplication
public class GradeSubmissionApplication implements CommandLineRunner {

	@Autowired
	StudentRepository studentRepository;

	@Autowired
	GradeRepository gradeRepository;

	@Autowired
	CourseRepository courseRepository;


	public static void main(String[] args) {
		SpringApplication.run(GradeSubmissionApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Student[] students = new Student[] {
            new Student("Toni Kroos", LocalDate.parse(("1980-07-31"))),
            new Student("Fabiano Carauana", LocalDate.parse(("1980-03-01"))),
            new Student("Matthew Perry", LocalDate.parse(("1979-09-19"))),
            new Student("Virat Kohli", LocalDate.parse(("1980-07-30"))) 
        };
		
		for (int i = 0; i < students.length; i++) {
			studentRepository.save(students[i]);
		}

		Course[] courses = new Course[] {
            new Course("Runs and sixes", "CR104", "In this class, you will learn about the game of Cricket."),
            new Course("Inverting the Pyramid", "FB103", "In this class, you will learn about the game of Football."),
            new Course("Be More Funny", "SR311", "In this class, you will learn the study of sarcasm and self-deprecating humour."),
            new Course("Magic of Chess", "CH393", "In this class, you will learn about significant events in chess history."),
        };

		for (int i = 0; i < courses.length; i++) {
			courseRepository.save(courses[i]);
		}
 
	}

}
