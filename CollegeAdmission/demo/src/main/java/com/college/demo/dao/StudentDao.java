package com.college.demo.dao;

import com.college.demo.model.Student;

import java.util.List;
import java.util.Optional;

public interface StudentDao
{
    void addStudent(Student student);
    List<Student> getAllStudents();
    Optional<Student> selectStudentById(int id);
    Optional<Student> getStudentByRank(int rank);
}
