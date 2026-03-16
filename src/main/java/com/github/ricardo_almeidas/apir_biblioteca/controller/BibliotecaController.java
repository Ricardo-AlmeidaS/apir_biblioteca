package com.github.ricardo_almeidas.apir_biblioteca.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/biblioteca")
public class BibliotecaController {

    @GetMapping("{nome}")
    public String bemVindo(@PathVariable String nome) {
        return "Seja bem-vindo " + nome + "!";
    }

    @GetMapping("/oi")
    public String ola() {
        return "Olá!";
    }
}
