package com.shiftechafrica.springdatajpamapping.dto;

import com.shiftechafrica.springdatajpamapping.model.Customer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CustomerRequest {
    private Customer customer;
}
