package com.shiftechafrica.springdatajpamapping.controller;

import com.shiftechafrica.springdatajpamapping.dto.CustomerRequest;
import com.shiftechafrica.springdatajpamapping.model.Customer;
import com.shiftechafrica.springdatajpamapping.service.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/customer")
@AllArgsConstructor
public class CustomerController {
    private CustomerService customerService;

    @PostMapping
    public Customer addCustomer(@RequestBody CustomerRequest customerRequest){
        return customerService.addCustomer(customerRequest);
    }

}
