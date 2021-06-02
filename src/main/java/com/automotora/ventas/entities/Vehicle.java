package com.automotora.ventas.entities;

import javax.persistence.*;

@Entity
@Table(name = "vehicle")
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idVehicle;

    @Column
    private String brand;
    @Column
    private String model;

    @ManyToOne
    //@JoinColumn(name="idCustomer", nullable=false, foreignKey = @ForeignKey(name = "id_customer", value = ConstraintMode.NO_CONSTRAINT))
    private Customer customer;


    public Vehicle() {
    }

    public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
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
}
