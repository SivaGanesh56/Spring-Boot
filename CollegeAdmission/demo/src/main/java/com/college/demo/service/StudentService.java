package com.college.demo.service;

import com.college.demo.dao.StudentDao;
import com.college.demo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService
{
    private StudentDao studentDao;

    @Autowired
    public StudentService(@Qualifier("FakeStudent") StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    public void addNewStudent(Student student)
    {
        studentDao.addStudent(student);
    }
    public List<Student> getAllStudents()
    {
        return studentDao.getAllStudents();
    }

    public Optional<Student> selectStudentById(int id)
    {
        return studentDao.selectStudentById(id);
    }

    public String CheckChances(int id)
    {
        Optional<Student> student = studentDao.selectStudentById(id);
        if(student.isPresent())
        {
            if(student.get().getRank()<=200)
            {
                return "Congralautions,You are Elgible :-)";
            }
            else
            {
                return "Sorry buddy,You can't";
            }
        }
        return "No Records Found";
    }

    public String feeEstimator(int rank)
    {
        Optional<Student> student = studentDao.getStudentByRank(rank);
        if(student.isPresent())
        {
            int result = student.get().getRank();
            if(result<=100)
            {
                return "No Fee :-)";
            }
            else if(result>100 && result<=250)
            {
                return "Half Amount of Your Selected College Fee";
            }
            else if(result>250 && result<=500)
            {
                return "3/4 of Fee you have to pay";
            }
            else
            {
                return "Full Fee";
            }
        }
        return "Not Eligible for Admission Process or Data Not Found" +
                "Please Contact Your College :-)";
    }

}
