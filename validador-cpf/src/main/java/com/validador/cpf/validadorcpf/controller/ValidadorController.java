package com.validador.cpf.validadorcpf.controller;

import com.validador.cpf.validadorcpf.service.ValidadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ValidadorController {

    @Autowired
    ValidadorService service;

    @GetMapping(path = "/api/validar/{cpf}")
    public boolean validar(@PathVariable("cpf") String cpf){
        return service.validaCpf(cpf);
    }
}
