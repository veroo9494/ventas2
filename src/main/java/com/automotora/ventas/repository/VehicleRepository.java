package com.automotora.ventas.repository;

import com.automotora.ventas.entities.Customer;
import com.automotora.ventas.entities.Vehicle;
import org.springframework.data.repository.CrudRepository;

public interface VehicleRepository  extends CrudRepository<Vehicle, Integer> {
}
