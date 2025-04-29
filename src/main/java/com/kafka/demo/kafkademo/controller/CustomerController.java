package com.kafka.demo.kafkademo.controller;

import com.kafka.demo.kafkademo.request.CreateCustomerRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @PostMapping("/create")
    public ResponseEntity<String> createCustomer(@RequestBody CreateCustomerRequest request) {


    }

}
