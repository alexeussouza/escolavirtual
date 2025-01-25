package br.com.escolaVirtual.controller;

import br.com.escolaVirtual.Respositorio.ProfessorRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/professor")

public class ProfessorController {

    @Autowired
    ProfessorRepositorio professorRepositorio;

    @GetMapping
    public String getInfo(){
        return "Professor 2025";
    }
}
