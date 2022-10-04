package com.shiftechafrica.springdatajpamapping.repository;

import com.shiftechafrica.springdatajpamapping.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
