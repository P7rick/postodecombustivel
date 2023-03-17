package com.primeirotrampodev.postodecombustivel.service;

import com.primeirotrampodev.postodecombustivel.entity.Combustivel;
import com.primeirotrampodev.postodecombustivel.repository.CombustivelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CombustivelService {
    @Autowired
    private CombustivelRepository combustivelRepository;

    public Combustivel salvarCombustivel(Combustivel combustivel){
        return combustivelRepository.save(combustivel);
    }
    public List<Combustivel> buscarTodosCombustiveis(){
        return combustivelRepository.findAll();
    }

    public Combustivel buscarPorId(Integer Id){
        Optional<Combustivel> combustivel = combustivelRepository.findById(Id);
        return combustivel.get();}
}
