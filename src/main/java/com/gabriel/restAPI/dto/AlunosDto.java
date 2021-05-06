package com.gabriel.restAPI.dto;

import com.gabriel.restAPI.model.Alunos;
import com.gabriel.restAPI.model.Cursos;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.domain.Page;

import java.util.ArrayList;
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
    private Cursos cursos;

    public AlunosDto(Alunos alunos) {
        this.id = alunos.getId();
        this.usuario = alunos.getUsuario();
        this.email = alunos.getEmail();
        this.nome = alunos.getNome();
        this.sobreNome = alunos.getSobreNome();
        this.idade = alunos.getIdade();
        this.cpf = alunos.getCpf();
        this.cursos = alunos.getCursos();
    }

    public static Page<AlunosDto> convert(Page<Alunos> alunos){
        return alunos.map(AlunosDto::new);
    }

}
