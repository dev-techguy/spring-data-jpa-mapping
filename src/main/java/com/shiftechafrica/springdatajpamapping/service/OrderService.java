package com.shiftechafrica.springdatajpamapping.service;

import com.shiftechafrica.springdatajpamapping.model.Product;
import com.shiftechafrica.springdatajpamapping.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class OrderService {
    private final ProductRepository productRepository;

    public Product addProduct(Product product) {
        return productRepository.save(product);
    }
}
