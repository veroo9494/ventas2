package com.automotora.ventas.service;

import com.automotora.ventas.DTO.CustomerDTO;
import com.automotora.ventas.DTO.ResultDTO;
import com.automotora.ventas.DTO.VehicleDTO;
import com.automotora.ventas.entities.Vehicle;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface VehicleService {

    VehicleDTO addVehicle(VehicleDTO vehicleDTO);
    List<VehicleDTO> getVehiclesByCustomer(CustomerDTO customerDTO);
    VehicleDTO toVehicleDTO(Vehicle vehicle);
    }
