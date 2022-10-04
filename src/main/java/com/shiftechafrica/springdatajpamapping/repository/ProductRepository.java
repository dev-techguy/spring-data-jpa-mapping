package com.shiftechafrica.springdatajpamapping.repository;

import com.shiftechafrica.springdatajpamapping.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
