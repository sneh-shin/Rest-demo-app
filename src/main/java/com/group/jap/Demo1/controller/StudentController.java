/*
 *Author Name: Sneha Shinde
 *Date: 11/18/2022
 * Created With: IntelliJ IDEA Community Edition
 */
package com.group.jap.Demo1.controller;

import com.group.jap.Demo1.domain.Student;
import com.group.jap.Demo1.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class StudentController {
    private StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/insertValue")
    public ResponseEntity<?> addFunction(@RequestBody Student student){
        Student student1 = studentService.saveStudent(student);
        return new ResponseEntity<>(student1, HttpStatus.CREATED);
    }

    @GetMapping("/fetchValue")
    public ResponseEntity<?> getFunction(){
        return new ResponseEntity<>(studentService.getAll(),HttpStatus.OK);
    }
    @DeleteMapping("/deleteValue/{id}")
    public String deleteFunction(@PathVariable int id){
        studentService.delete(id);
        return "Deleted";
    }
}
