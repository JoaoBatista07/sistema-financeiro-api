package com.joaobatista.sistemafinanceiro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joaobatista.sistemafinanceiro.model.Income;

public interface IncomeRepository extends JpaRepository<Income, Long> {

}
