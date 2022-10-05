package com.shiftechafrica.springdatajpamapping.controller;

import com.shiftechafrica.springdatajpamapping.model.Customer;
import com.shiftechafrica.springdatajpamapping.service.CustomerService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/customer")
@AllArgsConstructor
@Slf4j
public class CustomerController {
    private final CustomerService customerService;

    @PostMapping
    public ResponseEntity<Customer> addCustomer(@RequestBody Customer customer) {
        log.info("Customer is {}", customer);
        return new ResponseEntity<>(customerService.addCustomer(customer), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Customer>> customers() {
        return new ResponseEntity<>(customerService.findAllCustomers(), HttpStatus.OK);
    }

}
