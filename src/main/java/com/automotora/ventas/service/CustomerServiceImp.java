package com.automotora.ventas.service;

import com.automotora.ventas.DTO.CustomerDTO;
import com.automotora.ventas.DTO.FieldErrorDTO;
import com.automotora.ventas.DTO.ResultDTO;
import com.automotora.ventas.ENUM.Result;
import com.automotora.ventas.repository.CustomerRepository;
import com.automotora.ventas.entities.Customer;
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
    public String addCustomer(CustomerDTO customerDTO) {
        try {
            //mapstruck
            Customer customer = toCustomer(customerDTO);
            customerRepository.save(customer);
            return "Customer added";
        } catch (Exception e) {
            System.out.print(e.getStackTrace());
        }
        return "No se guardo";
    }

    public String updateCustomer(CustomerDTO customerDTO) {
        try {
            Customer customer = customerRepository.findById(customerDTO.getIdCustomer()).get();
            customer.setName(customerDTO.getName());
            customer.setEmail(customerDTO.getEmail());
            customerRepository.save(customer);
            return "Guardado";
        } catch (Exception e) {
            System.out.print(e.getStackTrace());
        }
        return "No se guardaron los cambios";
    }

    public ResultDTO deleteCustomer(CustomerDTO customerDTO) {
        ResultDTO resultDTO = new ResultDTO();
        try {
            Customer customer = toCustomer(customerDTO);
            if (validateCustomer(resultDTO, customerDTO,false)) {
                customerRepository.deleteById(customer.getId());
                resultDTO.setResult(Result.SUCCESS);
                resultDTO.setMsg("Customer deleted successfully");
            }

        } catch (Exception ex) {
            resultDTO.setResult(Result.ERROR);
            resultDTO.setMsg("ERROR COULD BE CONTROLLED");
        }
    return resultDTO;
    }

    public Customer toCustomer(CustomerDTO customerDTO) {
        Customer customer = new Customer(customerDTO.getIdCustomer(), customerDTO.getName(), customerDTO.getEmail());
        return customer;
    }

    public boolean validateCustomer(ResultDTO resultDTO, CustomerDTO customerDTO, boolean isNew){
        boolean rest = true;
        if(!isNew) {
            if (customerRepository.findById(customerDTO.getIdCustomer()).isEmpty()) {
                FieldErrorDTO fieldErrorDTO = new FieldErrorDTO("CUSTOMER ID", "DOESN'T EXIST");
                resultDTO.addError(fieldErrorDTO);
                rest = false;
            }
        }else{
           rest = true;
        }
        return rest;
    }

}
