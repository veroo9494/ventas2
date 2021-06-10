package com.automotora.ventas.rest.controller;

import com.automotora.ventas.DTO.ResultDTO;
import com.automotora.ventas.DTO.VehicleDTO;
import com.automotora.ventas.service.VehicleService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class VehicleController {

    private VehicleService vehicleService;
    private static final String vehicles = "/vehicles";

    public VehicleController(VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }

    @PostMapping(path = vehicles)
    public ResponseEntity<VehicleDTO> addVehicle(@RequestBody VehicleDTO vehicleDTO) {
        return ResponseEntity.ok(vehicleService.addVehicle(vehicleDTO));
    }

    //@GetMapping(path = vehicles)
   // public VehicleDTO getVehicleByCustomer(@RequestParam )

}
