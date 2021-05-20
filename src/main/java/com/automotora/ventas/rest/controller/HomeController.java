package com.automotora.ventas.rest.controller;

import com.automotora.ventas.service.HomeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    private HomeService homeService;

    public HomeController(HomeService homeService) {
        this.homeService = homeService;
    }

    @GetMapping ("/hello")
    public String saludar() {
        return homeService.saludar();
    }
}
