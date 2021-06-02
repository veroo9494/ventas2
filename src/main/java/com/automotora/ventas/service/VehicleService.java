package com.automotora.ventas.service;

import com.automotora.ventas.DTO.ResultDTO;
import com.automotora.ventas.DTO.VehicleDTO;
import com.automotora.ventas.entities.Vehicle;
import org.springframework.http.ResponseEntity;

public interface VehicleService {

    ResponseEntity<ResultDTO> addVehicle(VehicleDTO vehicleDTO);

}
