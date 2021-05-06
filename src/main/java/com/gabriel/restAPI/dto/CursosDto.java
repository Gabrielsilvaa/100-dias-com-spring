package com.gabriel.restAPI.dto;


import com.gabriel.restAPI.model.Cursos;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CursosDto {

    private Long id;
    private String curso;
    private LocalDate dataIncio;
    private LocalDate dataConclusao;
    private Long nota;

    public CursosDto(Cursos cursos) {
        this.id = cursos.getId();
        this.curso = cursos.getCurso();
        this.dataIncio = cursos.getDataIncio();
        this.dataConclusao = cursos.getDataConclusao();
        this.nota = cursos.getNota();
    }
}
