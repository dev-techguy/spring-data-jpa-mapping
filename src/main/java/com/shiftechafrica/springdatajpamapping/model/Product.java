package com.shiftechafrica.springdatajpamapping.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Product {

    @Id
    @GeneratedValue
    private int id;
    private int customerId;
    private String productName;
    private int qty;
    private double price;
}
