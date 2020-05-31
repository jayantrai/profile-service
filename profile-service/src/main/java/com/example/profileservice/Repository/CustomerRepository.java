package com.example.profileservice.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jayantrai.rentalcloud.commons.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}
