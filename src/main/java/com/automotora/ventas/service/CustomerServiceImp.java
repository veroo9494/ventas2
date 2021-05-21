package com.automotora.ventas.service;

import com.automotora.ventas.DTO.DTOCustomer;
import com.automotora.ventas.repository.CustomerRepository;
import com.automotora.ventas.entities.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerServiceImp implements CustomerService {

    private CustomerRepository customerRepository;

    public CustomerServiceImp(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public List<Customer> getCustomers() {
      /*  Customer firstCustumer = new Customer(1, "Pepe", "pepe@gmail.com");
        Customer secondCustumer = new Customer(2, "Pepe2", "pepe2@gmail.com");
        ArrayList<Customer> customers = new ArrayList<Customer>();
        customers.add(firstCustumer);
        customers.add(secondCustumer);
        */
        Iterable<Customer> all = customerRepository.findAll();
        List<Customer> customerList = new ArrayList<Customer>();
        for (Customer customer : all) {
            customerList.add(customer);
        }
        return customerList;
    }

    @Override
    public String addCustomer(DTOCustomer dtoCustomer) {
        try {
            //mapstruck
            Customer customer = new Customer(dtoCustomer.getName(), dtoCustomer.getEmail());
            customerRepository.save(customer);
            return "Customer added";
        } catch (Exception e) {
            System.out.print(e.getStackTrace());
        }
        return "No se guardo";
    }

    // CommandLineRunner commandLineRunner =
    //}


}
