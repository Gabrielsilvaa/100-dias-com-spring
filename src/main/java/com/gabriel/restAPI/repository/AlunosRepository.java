package com.gabriel.restAPI.repository;

import com.gabriel.restAPI.model.Alunos;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AlunosRepository extends JpaRepository<Alunos, Long> {

}
