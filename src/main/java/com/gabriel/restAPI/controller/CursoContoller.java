package com.gabriel.restAPI.controller;

import com.gabriel.restAPI.dto.CursosDto;
import com.gabriel.restAPI.model.Cursos;
import com.gabriel.restAPI.repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cursos")
public class CursoContoller {

    @Autowired
    private CursoRepository cursoRepository;

    @GetMapping
    public List<Cursos> cursosDto(){
        return cursoRepository.findAll();
    }

}
