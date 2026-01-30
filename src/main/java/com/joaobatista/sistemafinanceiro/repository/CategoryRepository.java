package com.joaobatista.sistemafinanceiro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joaobatista.sistemafinanceiro.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
