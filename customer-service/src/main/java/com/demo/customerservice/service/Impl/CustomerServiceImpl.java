package com.demo.customerservice.service.Impl;

import com.demo.commons.model.Customer;
import com.demo.customerservice.repository.CustomerRepository;
import com.demo.customerservice.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    @Override
    public Customer save(Customer customer) {
       return customerRepository.save(customer);
    }
}
