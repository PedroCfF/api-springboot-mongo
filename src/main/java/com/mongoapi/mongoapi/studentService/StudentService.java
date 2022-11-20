package com.mongoapi.mongoapi.studentService;

import com.mongoapi.mongoapi.models.Student;

import java.util.List;

public interface StudentService {
    List<Student> findAll();

    Student findByStudentNumber(long studentNumber);

    Student findByEmail(String email);

    List<Student> findAllByOrderByGpaDesc();

    Student saveOrUpdateStudent(Student student);

    void deleteStudentById(String id);

}
