package com.demo.customerservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;



@SpringBootApplication
@EntityScan(basePackages = "com.demo.commons.model")
public class CustomerManagementServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerManagementServiceApplication.class, args);
    }

}
