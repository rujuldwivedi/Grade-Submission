# Grade Submission

Welcome to the Grade Submission System, a project designed to manage grades for students enrolled in various courses. This project provides services for handling course information, student details, and grade submissions efficiently.

## Project Overview

The Grade Submission System comprises several components:

- **Controller**: Handles incoming requests and routes them to the appropriate service layer.
- **Service Layer**: Contains business logic for managing courses, grades, and students.
  - **CourseServiceImpl**: Implements methods for CRUD operations on courses.
  - **GradeServiceImpl**: Implements methods for CRUD operations on grades, including getting, saving, updating, and deleting grades.
  - **StudentServiceImpl**: Implements methods for CRUD operations on students.
- **Repository**: Interfaces with the database to perform CRUD operations on entities.
- **Entity**: Represents data objects such as courses, grades, and students.
- **Exception**: Defines custom exceptions for error handling.
- **Application**: Main entry point for the application.

## Service Layer

### CourseServiceImpl

The `CourseServiceImpl` class provides methods for managing courses:

- **getCourse(Long id)**: Retrieves a course by ID.
- **saveCourse(Course course)**: Saves a new course.
- **deleteCourse(Long id)**: Deletes a course by ID.
- **getCourses()**: Retrieves all courses.

### GradeServiceImpl

The `GradeServiceImpl` class provides methods for managing grades:

- **getGrade(Long studentId, Long courseId)**: Retrieves a grade for a given student and course.
- **saveGrade(Grade grade, Long studentId, Long courseId)**: Saves a new grade for a student in a course.
- **updateGrade(String score, Long studentId, Long courseId)**: Updates the score of a grade for a student in a course.
- **deleteGrade(Long studentId, Long courseId)**: Deletes a grade for a student in a course.
- **getStudentGrades(Long studentId)**: Retrieves all grades for a given student.
- **getCourseGrades(Long courseId)**: Retrieves all grades for a given course.
- **getAllGrades()**: Retrieves all grades.

### StudentServiceImpl

The `StudentServiceImpl` class provides methods for managing students:

- (Methods similar to CourseServiceImpl)

## Getting Started

To set up and run the Grade Submission System project:

1. Clone the repository: `git clone https://github.com/rujuldwivedi/Grade-Submission`
2. Ensure you have Java and Spring Boot installed on your machine.
3. Set up your database and configure the application properties accordingly.
4. Run the application using your preferred IDE or the command line.

## Usage

Once the application is running, you can interact with it through RESTful endpoints. Use tools like Postman or cURL to make requests to the controller endpoints.

## Contributing

Contributions to the Grade Submission System project are welcome! Whether you want to add new features, fix bugs, or improve documentation, feel free to open issues or submit pull requests.

## Acknowledgments

We extend our appreciation to all contributors and users of the Grade Submission System project. Your support and feedback are invaluable in making this project successful.
