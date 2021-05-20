package com.automotora.ventas.rest.controller;

import com.automotora.ventas.models.Customer;
import com.automotora.ventas.service.CustomerService;
import com.automotora.ventas.service.HomeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CustomerController {

    private CustomerService customerService;
    private static final String path = "/customers";

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }


    @GetMapping(path)
    public ArrayList<Customer> getCustomers() {
        return customerService.getCustomers();
    }

}
