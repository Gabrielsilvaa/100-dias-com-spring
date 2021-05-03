package com.gabriel.restAPI.dto;

import com.gabriel.restAPI.model.Alunos;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.Column;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AlunosDto {

    private Long id;
    private String usuario;


    private String cpf;
    private String email;
    private String nome;
    private String sobreNome;
    private Integer idade;

    public AlunosDto(Alunos alunos) {
        this.id = alunos.getId();
        this.usuario = alunos.getUsuario();
        this.email = alunos.getEmail();
        this.nome = alunos.getNome();
        this.sobreNome = alunos.getSobreNome();
        this.idade = alunos.getIdade();
        this.cpf = alunos.getCpf();
    }

    public static  List<AlunosDto> convert(List<Alunos> alunos){
        return alunos.stream().map(AlunosDto::new).collect(Collectors.toList());
    }

}
