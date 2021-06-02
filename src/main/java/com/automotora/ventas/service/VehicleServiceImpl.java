package com.automotora.ventas.service;

import com.automotora.ventas.DTO.VehicleDTO;
import com.automotora.ventas.repository.VehicleRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class VehicleServiceImpl implements VehicleService{

    private VehicleRepository vehicleRepository;

    public VehicleServiceImpl(VehicleRepository vehicleRepository){
        this.vehicleRepository = vehicleRepository;
    }

    @Override
    public ResponseEntity addVehicle(VehicleDTO vehicleDTO){

        return null;
    }


}
