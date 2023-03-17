package com.primeirotrampodev.postodecombustivel.service;

import com.primeirotrampodev.postodecombustivel.entity.BombaDeCombustivel;
import com.primeirotrampodev.postodecombustivel.entity.Combustivel;
import com.primeirotrampodev.postodecombustivel.repository.BombadeCombustivelRepository;
import com.primeirotrampodev.postodecombustivel.repository.CombustivelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class BombadeCombustivelService {
    @Autowired
    private BombadeCombustivelRepository bombadeCombustivelRepository;
    @Autowired
    private CombustivelService combustivelService;

    public BombaDeCombustivel salvarBombadeCombustivel(BombaDeCombustivel bombaDeCombustivel) {

        List<Combustivel> combustivelList = new ArrayList<>();

        for (Integer contador = 0; contador < bombaDeCombustivel.getCombustivelList().size() ; contador++) {
            Integer idCombustivel = bombaDeCombustivel.getCombustivelList().get(contador).getId();//  // get pega primeiro objeto

            Combustivel combustivel = combustivelService.buscarPorId(idCombustivel);
            combustivelList.add(combustivel);

        }

        bombaDeCombustivel.setCombustivel(combustivelList);

        return bombadeCombustivelRepository.save(bombaDeCombustivel);
    }

    public List<BombaDeCombustivel> buscarTodasAsBombasDeCombustiveis() {
       return bombadeCombustivelRepository.findAll();
    }
}

