package com.automotora.ventas.service;

import com.automotora.ventas.DTO.DTOCustomer;
import com.automotora.ventas.entities.Customer;

import java.util.List;

public interface CustomerService {

    String addCustomer(DTOCustomer dtoCustomer);
    List<Customer> getCustomers();
}
