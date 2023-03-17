package com.primeirotrampodev.postodecombustivel.controller;

import com.primeirotrampodev.postodecombustivel.entity.Combustivel;
import com.primeirotrampodev.postodecombustivel.repository.CombustivelRepository;
import com.primeirotrampodev.postodecombustivel.service.CombustivelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = ("/combustivel"))
public class CombustivelController {
    @Autowired
    private CombustivelService combustivelService;
    @PostMapping(value="/salvar")
    public  Combustivel salvarCombustivel(@RequestBody Combustivel combustivel){
        return combustivelService.salvarCombustivel(combustivel);

    }
    @GetMapping(value = "/buscar-combustiveis")
    public List<Combustivel> buscarTodosCombustiveis(){
        return combustivelService.buscarTodosCombustiveis();
    }
}
