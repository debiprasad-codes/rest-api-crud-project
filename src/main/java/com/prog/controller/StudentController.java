package com.prog.controller;

import com.prog.entity.Student;
import com.prog.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/addstudent")
   public  Student addStudent(@RequestBody Student student){
         return studentService.saveStudent(student);
    }
    @GetMapping("/gettAllStudents")
    public List<Student> getAllStudents(@RequestBody List<Student> students){
        return studentService.getAllStudents();
    }

    @GetMapping("/getStudentById/{id}")
    public Student getStudentById(@PathVariable int id){
        return studentService.getById(id);
    }

    @PutMapping("/updateStudent")
    public Student updateStudent(@RequestBody Student student){
        return studentService.updateStudent(student);
    }

    @DeleteMapping("/deleteStudent/{id}")
    public void deleteStudentById(@PathVariable int id){
        studentService.deleteStudent(id);
    }
}
