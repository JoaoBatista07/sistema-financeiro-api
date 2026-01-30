package com.joaobatista.sistemafinanceiro.model;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_user")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_user", nullable = false, unique = true)
	private Long idUser;
	
	@Column(name = "name_user", nullable = false, length = 100)
	private String nameUser;
	
	@Column(name = "email_user", nullable = false, unique = true, length = 100)
	private String emailUser;
	
	@Column(name = "password_user", nullable = false, length = 100)
	private String passwordUser;
	
	@Column(name = "creation_user", nullable = false)
	private LocalDate creationUser;
	
	@Column(name = "active_user")
	private boolean activeUser;
	
	@OneToMany(mappedBy = "userCategory")
	private List<Category> listCategoryUser;
	
	@OneToMany(mappedBy = "incomeUser")
	private List<Income> listIncomeUser;
	
	@OneToMany(mappedBy = "expensiveUser")
	private List<Expensive> listExpensiveUser;
	
}
