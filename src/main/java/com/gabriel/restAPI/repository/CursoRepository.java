package com.gabriel.restAPI.repository;

import com.gabriel.restAPI.model.Cursos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository extends JpaRepository<Cursos, Long> {

}
