package com.joaobatista.sistemafinanceiro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joaobatista.sistemafinanceiro.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
