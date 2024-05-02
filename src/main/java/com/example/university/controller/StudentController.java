package com.example.university.controller;

import com.example.university.domain.dto.StudentDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/students")
public class StudentController {

    @GetMapping
    public ResponseEntity <List<StudentDto>> fetchAllStudents (){
        return ResponseEntity.ok().build();
    }


}
