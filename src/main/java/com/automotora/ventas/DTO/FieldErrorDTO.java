package com.automotora.ventas.DTO;

public class FieldErrorDTO {
    private String property;
    private  String msg;

    public FieldErrorDTO() {
    }

    public FieldErrorDTO(String property, String messege) {
        this.property = property;
        this.msg = messege;
    }

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
