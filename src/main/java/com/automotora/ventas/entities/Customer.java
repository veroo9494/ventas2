package com.automotora.ventas.entities;

import javax.persistence.*;

@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idCustomer;

    @Column
    private String name;
    @Column
    private String email;

    public Customer() {
    }

    public Customer(Integer idCustomer, String name, String email) {
        this.idCustomer = idCustomer;
        this.name = name;
        this.email = email;
    }

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public int getId() {
        return idCustomer;
    }

    public void setId(int idCustomer) {
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

    @Override
    public String toString() {
        return "Customer{" +
                "idCustomer=" + idCustomer +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
