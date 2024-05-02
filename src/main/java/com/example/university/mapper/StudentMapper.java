package com.example.university.mapper;

import com.example.university.domain.dto.StudentDto;
import com.example.university.domain.student.Student;
import com.example.university.service.DbService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class StudentMapper {

    private DbService dbService;

    public List<StudentDto> mapToStudentDtoList (List <Student> students) {
        return students.stream()
                .map(this::mapToStudentDto)
                .collect(Collectors.toList());
    }

    public StudentDto mapToStudentDto(Student student) {
        return StudentDto.builder()
                .id(student.getId())
                .firstName(student.getFirstName())
                .lastName(student.getLastName())
                .email(student.getEmail())
                .addressId(student.getAddress().getId())
                .build();
    }

        public Student mapToStudent(StudentDto studentDto) {
        return Student.builder()
                .id(studentDto.getId())
                .firstName(studentDto.getFirstName())
                .lastName(studentDto.getLastName())
                .email(studentDto.getEmail())
                .address(dbService.getAddressById(studentDto.getAddressId()))
                .build();
    }


}
