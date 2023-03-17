package com.primeirotrampodev.postodecombustivel.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.List;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class BombaDeCombustivel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    private String nome;
    @JsonProperty("combustivelList")
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)//falar quem é o dono do relacionamento
    private List<Combustivel> combustivelList;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        this.Id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Combustivel> getCombustivelList() {
        return combustivelList;
    }

    public void setCombustivel(List<Combustivel> combustivelList) {
        this.combustivelList = combustivelList;
    }

    }

