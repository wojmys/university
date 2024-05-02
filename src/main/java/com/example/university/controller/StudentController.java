package com.example.university.controller;

import com.example.university.domain.dto.StudentDto;
import com.example.university.domain.student.Student;
import com.example.university.mapper.StudentMapper;
import com.example.university.service.DbService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/students")
@CrossOrigin("*")
public class StudentController {

    private final DbService dbService;
    private final StudentMapper studentMapper;

    @GetMapping
    public ResponseEntity <List<StudentDto>> fetchAllStudents (){

        List<Student> students = dbService.getAllStudents();
        return ResponseEntity.ok(studentMapper.mapToStudentDtoList(students));
    }


}
