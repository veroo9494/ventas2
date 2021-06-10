package com.automotora.ventas.service;

import com.automotora.ventas.DTO.CustomerDTO;
import com.automotora.ventas.DTO.ResultDTO;
import com.automotora.ventas.DTO.VehicleDTO;
import com.automotora.ventas.entities.Customer;
import com.automotora.ventas.entities.Vehicle;
import com.automotora.ventas.repository.VehicleRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.*;

@Service
public class VehicleServiceImpl implements VehicleService {

    private VehicleRepository vehicleRepository;
    private CustomerService customerService;

    public VehicleServiceImpl(VehicleRepository vehicleRepository, CustomerService customerService) {
        this.vehicleRepository = vehicleRepository;
        this.customerService = customerService;
    }

    @Override
    public VehicleDTO addVehicle(VehicleDTO vehicleDTO) {
        Customer customer = customerService.getCustomer(vehicleDTO.getIdCustomer());
        Vehicle vehicle = new Vehicle(vehicleDTO.getBrand(), vehicleDTO.getModel(), customer);
        if (customer != null) {
            if (CollectionUtils.isEmpty(customer.getVehicles())) {
                Set<Vehicle> vehicles = new HashSet<>();
                vehicles.add(vehicle);
                customer.setVehicles(vehicles);
                vehicleRepository.save(vehicle);
            } else {
                customer.getVehicles().add(vehicle);
            }
        }
        return new VehicleDTO();
    }

    @Override
    public List<VehicleDTO> getVehiclesByCustomer(CustomerDTO customerDTO) {
        Customer customer = customerService.getCustomer(customerDTO.getIdCustomer());
        if (customer != null) {
            Set<Vehicle> vehicles = customer.getVehicles();
            List<VehicleDTO> vehiclesDTO = new ArrayList<VehicleDTO>();
            for (Vehicle v : vehicles) {
                vehiclesDTO.add(toVehicleDTO(v));
            }
            return vehiclesDTO;
        } else {
            return null;
        }
    }

    @Override
    public VehicleDTO toVehicleDTO(Vehicle vehicle) {
        VehicleDTO vehicleDTO = new VehicleDTO(vehicle.getBrand(), vehicle.getModel(), null);
        return vehicleDTO;
    }

}



