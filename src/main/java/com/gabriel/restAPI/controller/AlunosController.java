package com.gabriel.restAPI.controller;

import com.gabriel.restAPI.dto.AlunosDto;
import com.gabriel.restAPI.model.Alunos;
import com.gabriel.restAPI.repository.AlunosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunosController {

    @Autowired
    private AlunosRepository alunosRepository;

    @GetMapping
    public List<AlunosDto> listaAlunos(){
        List<Alunos> alunos = alunosRepository.findAll();
        return AlunosDto.convert(alunos);
    }


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Alunos add(@Valid @RequestBody Alunos alunos){
        return alunosRepository.save(alunos);
    }

    @PutMapping("/{alunoId}")
    public ResponseEntity<Alunos> update(@PathVariable Long alunoId, @RequestBody Alunos alunos){

        if(!alunosRepository.existsById(alunoId)){
            return ResponseEntity.notFound().build();
        }

        alunos.setId(alunoId);
        alunos = alunosRepository.save(alunos);
        return ResponseEntity.ok(alunos);
    }

    @DeleteMapping("/{alunoId}")
    public ResponseEntity<Void> delete(@PathVariable Long alunoId){

        if(!alunosRepository.existsById(alunoId)){
            return ResponseEntity.notFound().build();
        }

        alunosRepository.deleteById(alunoId);
        return ResponseEntity.noContent().build();
    }

}
