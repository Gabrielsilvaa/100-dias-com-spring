package com.gabriel.restAPI.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cursos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column @NotEmpty @NotNull
    private String curso;

    @Column @NotEmpty @NotNull
    private LocalDate dataIncio;

    @Column
    private LocalDate dataConclusao;

    @Column
    private Long nota;

    @ManyToOne
    private Alunos alunos;

    //muitos para um
    //um para todos
    //um para um
    //muitos para muitos

}
