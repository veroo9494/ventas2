package com.automotora.ventas.DTO;

public class CustomerDTO {
    private Integer idCustomer;
    private String name;
    private String email;

    public CustomerDTO() {
    }

    public CustomerDTO(Integer idCustomer, String name, String email) {
        this.idCustomer = idCustomer;
        this.name = name;
        this.email = email;
    }

    public Integer getId() {
        return idCustomer;
    }

    public void setId(Integer idCustomer) {
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
}
