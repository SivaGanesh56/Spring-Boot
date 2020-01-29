package com.college.demo.api;

import com.college.demo.model.Student;
import com.college.demo.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("/api/v1/student")
@RestController
public class StudentController
{
    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping
    public void addStudent(@RequestBody  Student student)
    {
        studentService.addNewStudent(student);
    }
    @GetMapping
    public List<Student> getAllStudents()
    {
        return studentService.getAllStudents();
    }

    @GetMapping(path = "{id}")
    public Optional<Student> selectStudentById(@PathVariable("id") int id)
    {
        return studentService.selectStudentById(id);
    }

    @GetMapping(path="/check/{id}")
    public String CheckEligibilty(@PathVariable("id") int id)
    {
        return studentService.CheckChances(id);
    }

    @GetMapping(path = "/estimate/{rank}")
    public String feeEstimation(@PathVariable("rank") int rank)
    {
        return studentService.feeEstimator(rank);
    }
}