package com.automotora.ventas.rest.controller;

import com.automotora.ventas.DTO.DTOCustomer;
import com.automotora.ventas.entities.Customer;
import com.automotora.ventas.service.CustomerService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
public class CustomerController {

    private CustomerService customerService;
    private static final String getCustomersPath = "/customers";
    private static final String newCustomerPath = "/newcustomer";

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping(newCustomerPath)
    public String addCustomer(@RequestParam("name") String name, @RequestParam("email") String email){
        DTOCustomer dtoCustomer = new DTOCustomer(name,email );
        return customerService.addCustomer(dtoCustomer);
    }

    @GetMapping(getCustomersPath)
    public List<Customer> getCustomers() {
        return customerService.getCustomers();
    }

}
