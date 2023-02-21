package com.brunoroberto.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brunoroberto.cursomc.domain.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Integer> {

}
