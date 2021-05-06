package com.gabriel.restAPI.model;

import javassist.tools.rmi.ObjectNotFoundException;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Optional;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Alunos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column @NotNull @NotEmpty @Length(max = 25)
    private String usuario;

    @Column
    private String senha;

    @Column @NotNull @NotEmpty @Email
    private String email;

    @Column
    private String nome;

    @Column
    private String sobreNome;

    @Column
    private Integer idade;

    @Column @NotNull @NotEmpty @CPF
    private String cpf;

    @ManyToOne
    private Cursos cursos;
}
