package com.example.university.service;

import com.example.university.domain.address.Address;
import com.example.university.domain.student.Student;
import com.example.university.repository.AddressRepository;
import com.example.university.repository.StudentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class DbService {

    private final StudentRepository studentRepository;
    private final AddressRepository addressRepository;

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Address getAddressById(Long id){
        return addressRepository.getAddressById(id);
    }
}
