package com.prog.service;

import com.prog.entity.Student;

import java.util.List;

public interface StudentService {

    List<Student> getAllStudents();

    Student getById(int id);

    Student saveStudent(Student student);

    Student updateStudent(Student student);

    void deleteStudent(int id);
}
