package com.shiftechafrica.springdatajpamapping.controller;

import com.shiftechafrica.springdatajpamapping.model.Product;
import com.shiftechafrica.springdatajpamapping.service.OrderService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/order")
@Slf4j
@AllArgsConstructor
public class OrderController {
    private final OrderService orderService;

    @PostMapping
    public ResponseEntity<Product> addProduct(@RequestBody Product product) {
        log.info("Product is {}", product);
        return new ResponseEntity<>(orderService.addProduct(product), HttpStatus.CREATED);
    }
}
