package com.automotora.ventas.service;

import com.automotora.ventas.models.Customer;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerServiceImp implements CustomerService {

    @Override
    public ArrayList<Customer> getCustomers() {
        Customer firstCustumer = new Customer(1, "Pepe", "pepe@gmail.com");
        Customer secondCustumer = new Customer(2, "Pepe2", "pepe2@gmail.com");
        ArrayList<Customer> customers = new ArrayList<Customer>();
        customers.add(firstCustumer);
        customers.add(secondCustumer);
        return customers;
    }
}
