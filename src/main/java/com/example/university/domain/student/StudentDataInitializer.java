package com.example.university.domain.student;

import com.example.university.domain.address.Address;
import com.example.university.repository.AddressRepository;
import com.example.university.repository.StudentRepository;
import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class StudentDataInitializer {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private AddressRepository addressRepository;

    @PostConstruct
    public void initData() {

        Address address1 = new Address("Main Street 1", "City A");
        addressRepository.save(address1);

        Address address2 = new Address("Second Street 2", "City B");
        addressRepository.save(address2);

        Student student1 = new Student( "John", "Doe", "john.doe@example.com", address1);
        Student student2 = new Student( "Jane", "Smith", "jane.smith@example.com", address2);

        studentRepository.save(student1);
        studentRepository.save(student2);

       log.info("Added students to DB");
    }

}
