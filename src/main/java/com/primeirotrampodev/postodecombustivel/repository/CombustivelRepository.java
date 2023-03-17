package com.primeirotrampodev.postodecombustivel.repository;

import com.primeirotrampodev.postodecombustivel.entity.Combustivel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface CombustivelRepository extends JpaRepository <Combustivel, Integer> {

}
