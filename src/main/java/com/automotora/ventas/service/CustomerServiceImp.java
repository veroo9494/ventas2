package com.automotora.ventas.service;

import com.automotora.ventas.models.Customer;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerServiceImp implements CustomerService {

    @Override
    public ArrayList<Customer> getCustomers() {
        Customer custumer1 = new Customer(1, "Pepe", "pepe@gmail.com");
        Customer custumer2 = new Customer(2, "Pepe2", "pepe2@gmail.com");
        ArrayList<Customer> customers = new ArrayList<Customer>();
        customers.add(custumer1);
        customers.add(custumer2);
        return customers;
    }
}
