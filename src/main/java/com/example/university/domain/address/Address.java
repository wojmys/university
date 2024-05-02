package com.example.university.domain.address;

import com.example.university.domain.student.Student;
import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor
@Builder
@AllArgsConstructor
@Getter
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String street;
    private String city;

    @OneToOne(mappedBy = "address")
    private Student student;

    public Address(String street, String city) {
        this.street = street;
        this.city = city;
    }
}
