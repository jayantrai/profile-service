package com.example.profileservice.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.profileservice.Repository.CustomerRepository;
import com.jayantrai.rentalcloud.commons.model.Customer;


@Service
public class CustomerServiceImpl implements CustomerService {
	
	
	@Autowired
	CustomerRepository customerRepository;

	@Override
	public Customer save(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
