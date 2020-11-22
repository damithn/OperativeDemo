package com.demo.customerservice.controller;

import com.demo.commons.model.Customer;
import com.demo.customerservice.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/services")
public class CustomersController {

    @Autowired
    CustomerService customerService;

    public Customer save(@RequestBody Customer customer) {
        return customerService.save(customer);
    }
}
