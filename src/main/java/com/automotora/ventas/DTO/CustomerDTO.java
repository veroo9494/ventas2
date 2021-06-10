package com.automotora.ventas.DTO;

import java.util.ArrayList;

public class CustomerDTO {
    private Integer idCustomer;
    private String name;
    private String email;
    private ArrayList<VehicleDTO> vehicles;

    public CustomerDTO() {
    }

    public CustomerDTO(Integer idCustomer, String name, String email) {
        this.idCustomer = idCustomer;
        this.name = name;
        this.email = email;
    }

    public Integer getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(Integer idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<VehicleDTO> getVehicles() {
        return vehicles;
    }

    public void setVehicles(ArrayList<VehicleDTO> vehicles) {
        this.vehicles = vehicles;
    }
}
