package com.automotora.ventas.DTO;


public class VehicleDTO {
    private Integer idVehicle;
    private String brand;
    private String model;
    private Integer idCustomer;

    public VehicleDTO() {
    }

    public VehicleDTO(String brand, String model, Integer idCustomer) {
        this.brand = brand;
        this.model = model;
        this.idCustomer = idCustomer;
    }

    public Integer getIdVehicle() {
        return idVehicle;
    }

    public void setIdVehicle(Integer idVehicle) {
        this.idVehicle = idVehicle;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(Integer idCustomer) {
        this.idCustomer = idCustomer;
    }
}
