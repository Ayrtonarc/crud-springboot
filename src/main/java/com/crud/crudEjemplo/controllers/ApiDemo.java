package com.crud.crudEjemplo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class ApiDemo {

    @GetMapping("/saludar")
    public String saludar(){
        return "Hola mundo desde spring";
    }
}
