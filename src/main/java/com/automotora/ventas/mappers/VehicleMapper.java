package com.automotora.ventas.mappers;

import com.automotora.ventas.DTO.VehicleDTO;
import com.automotora.ventas.entities.Vehicle;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;


@Mapper
public interface VehicleMapper {

    VehicleMapper INSTANCE = Mappers.getMapper(VehicleMapper.class);

    VehicleDTO vehicleToVehicleDTO(Vehicle vehicle);
}
