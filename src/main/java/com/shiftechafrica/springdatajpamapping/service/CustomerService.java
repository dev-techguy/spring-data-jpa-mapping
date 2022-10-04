package com.shiftechafrica.springdatajpamapping.service;

import com.shiftechafrica.springdatajpamapping.dto.CustomerRequest;
import com.shiftechafrica.springdatajpamapping.model.Customer;
import com.shiftechafrica.springdatajpamapping.repository.CustomerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CustomerService {
    private CustomerRepository customerRepository;

    public Customer addCustomer(CustomerRequest customerRequest) {
        return customerRepository.save(customerRequest.getCustomer());
    }
}
