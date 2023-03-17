package com.primeirotrampodev.postodecombustivel.controller;

import com.primeirotrampodev.postodecombustivel.entity.BombaDeCombustivel;
import com.primeirotrampodev.postodecombustivel.service.BombadeCombustivelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = ("/bombadecombustivel"))
public class BombadeCombustivelController {
    @Autowired
    private BombadeCombustivelService bombadeCombustivelService;
@PostMapping(value = ("/salvar"))
    public BombaDeCombustivel salvarBombadeCombustivel(@RequestBody BombaDeCombustivel bombaDeCombustivel){
        return bombadeCombustivelService.salvarBombadeCombustivel(bombaDeCombustivel);
    }
@GetMapping(value = ("/buscar-bombas"))
    public List<BombaDeCombustivel> buscarBombadeCombustiveis(){
    return bombadeCombustivelService.buscarTodasAsBombasDeCombustiveis();
    }
}
