package com.joaobatista.sistemafinanceiro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joaobatista.sistemafinanceiro.model.Expensive;

public interface ExpensiveRepository extends JpaRepository<Expensive, Long> {

}