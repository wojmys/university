package com.example.university.repository;

import com.example.university.domain.address.Address;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends CrudRepository <Address, Long> {

    Address getAddressById(Long id);
}
