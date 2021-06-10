package com.automotora.ventas.service;

import com.automotora.ventas.DTO.CustomerDTO;
import com.automotora.ventas.DTO.ResultDTO;
import com.automotora.ventas.entities.Customer;

import java.util.List;

public interface CustomerService {

    String addCustomer(CustomerDTO customerDTO);

    String updateCustomer(CustomerDTO customerDTO);

    List<Customer> getCustomers();

    ResultDTO deleteCustomer(CustomerDTO customerDTO);

    Customer getCustomer(Integer idCustomer);

}
