package com.automotora.ventas.rest.controller;

import com.automotora.ventas.DTO.CustomerDTO;
import com.automotora.ventas.DTO.ResultDTO;
import com.automotora.ventas.entities.Customer;
import com.automotora.ventas.service.CustomerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {

    private CustomerService customerService;
    private static final String getCustomersPath = "/customers";
    private static final String newCustomerPath = "/newcustomer";
    private static final String updateCustomerPath = "/updatecustomer";
    private static final String deleteCustomerPath = "/deletecustomer";

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping(path = newCustomerPath)
    public String addCustomer(@RequestBody CustomerDTO customerDTO){
        return customerService.addCustomer(customerDTO);
    }

    @GetMapping(getCustomersPath)
    public List<Customer> getCustomers() {
        return customerService.getCustomers();
    }

    @PatchMapping(path = updateCustomerPath)
    public String updateCustomer(@RequestParam("id") Integer idCustomer, @RequestBody CustomerDTO customerDTO){
        customerDTO.setIdCustomer(idCustomer);
        return customerService.updateCustomer(customerDTO);
    }

    @DeleteMapping(path = deleteCustomerPath)
    public ResultDTO deleteCustomer(@RequestBody CustomerDTO customerDTO){
        return customerService.deleteCustomer(customerDTO);
    }





}
