package com.automotora.ventas.service;

import org.springframework.stereotype.Service;

@Service
public class HomeServiceImpl implements HomeService{

    @Override
    public String saludar() {
        return "Hola mundooo";
    }
}
