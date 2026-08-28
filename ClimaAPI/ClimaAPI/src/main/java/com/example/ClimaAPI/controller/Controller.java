package com.example.ClimaAPI.controller;

import com.example.ClimaAPI.service.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    Service service = new Service();

    @GetMapping("/climaBH/atual")
    public String consultarClimaAtual(){
        return service.consultarClimaAtual();
    }
    @GetMapping("/climaBH/diario")
    public String consultarClimaDiario(){
        return service.consultarClimaDiario();
    }
    @GetMapping("/climaBH/semanal")
    public String consultarClimaSemanal(){
        return service.consultarClimaSemanal();
    }
}
