package com.shiftechafrica.springdatajpamapping.service;

import com.shiftechafrica.springdatajpamapping.model.Customer;
import com.shiftechafrica.springdatajpamapping.repository.CustomerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CustomerService {
    private final CustomerRepository customerRepository;

    public Customer addCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    public List<Customer> findAllCustomers() {
        return customerRepository.findAll();
    }
}
