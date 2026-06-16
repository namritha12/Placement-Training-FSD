package com.example.h2database;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentRepository repo;

    public StudentController(StudentRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<Student> getStudents() {
        return repo.findAll();
    }

    @PostMapping
    public Student addStudent(@RequestBody Student s) {
        return repo.save(s);
    }

}
