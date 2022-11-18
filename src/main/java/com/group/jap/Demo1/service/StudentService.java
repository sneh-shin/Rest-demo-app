package com.group.jap.Demo1.service;

import com.group.jap.Demo1.domain.Student;

import java.util.List;

public interface StudentService {
    Student saveStudent(Student student);
    void delete(int id);
    List<Student> getAll();
}
