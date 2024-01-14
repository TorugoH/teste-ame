package com.exercicios.ameTest.repository;

import com.exercicios.ameTest.model.Planetas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;
import org.springframework.data.repository.query.Param;

@Component
public interface PlanetasRepository extends JpaRepository<Planetas,Integer> {
    @Query("select p from Planetas p where nome =?1")
    Planetas findByNome(@Param("nome") String nome);
}
