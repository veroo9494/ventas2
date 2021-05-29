package com.automotora.ventas.DTO;

public class FieldErrorDTO {
    private String property;
    private  String messege;

    public FieldErrorDTO() {
    }

    public FieldErrorDTO(String property, String messege) {
        this.property = property;
        this.messege = messege;
    }

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    public String getMessege() {
        return messege;
    }

    public void setMessege(String messege) {
        this.messege = messege;
    }
}
