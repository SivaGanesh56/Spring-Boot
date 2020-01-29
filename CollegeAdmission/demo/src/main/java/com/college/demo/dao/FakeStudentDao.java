package com.college.demo.dao;

import com.college.demo.model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository("FakeStudent")
public class FakeStudentDao implements StudentDao
{
    List<Student> DB = new ArrayList<>();

    @Override
    public Optional<Student> getStudentByRank(int rank) {
        return DB.stream().filter(st->st.getRank()==rank).findFirst();
    }

    @Override
    public void addStudent(Student student)
    {
        DB.add(student);
    }

    @Override
    public Optional<Student> selectStudentById(int id) {
        return DB.stream().filter(st-> st.getId()==id).findFirst();
    }

    @Override
    public List<Student> getAllStudents() {
        return DB;
    }
}
