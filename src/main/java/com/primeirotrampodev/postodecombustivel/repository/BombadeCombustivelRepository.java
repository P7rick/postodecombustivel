package com.primeirotrampodev.postodecombustivel.repository;

import com.primeirotrampodev.postodecombustivel.entity.BombaDeCombustivel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BombadeCombustivelRepository extends JpaRepository <BombaDeCombustivel, Integer> {
}
