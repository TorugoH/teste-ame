package com.exercicios.ameTest.controller;

import com.exercicios.ameTest.model.Planetas;
import com.exercicios.ameTest.repository.PlanetasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class PlanetasController {
    @Autowired
    PlanetasRepository planetasRepository;

    @PostMapping
    private void cadastrarPlanetas(@RequestBody Planetas planetas){
            planetasRepository.save(planetas);
    }
    @GetMapping
    private List<Planetas> listarPlanetas(){
        return planetasRepository.findAll();
    }
    @GetMapping("buscarPeloId/{id}")
    private Optional<Planetas> buscarId(@PathVariable("id")Integer id){
        return planetasRepository.findById(id);
    }
    @GetMapping("buscarPeloNome/{nome}")
    private Planetas buscarNome(@PathVariable("nome")String nome){
        return planetasRepository.findByNome(nome);
    }
}
