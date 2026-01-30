package com.joaobatista.sistemafinanceiro.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_income")
public class Income {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_income", nullable = false, unique = true)
	private Long idIncome;
	
	@Column(name = "description_income", nullable = false, length = 100)
	private String descriptionIncome;
	
	@Column(name = "value_income", nullable = false)
	private Double valueIncome;
	
	@Column(name = "date_income", nullable = false)
	private LocalDate dateIncome;
	
	@Column(name = "observation_income", length = 200)
	private String observationIncome;
	
	@Column(name = "creation_income", nullable = false)
	private LocalDate creationIncome;
	
	@ManyToOne
	@JoinColumn(name = "id_user", nullable = false)
	private User incomeUser;
	
	@ManyToOne
	@JoinColumn(name = "id_category")
	private Category incomeCategory;
	
	
	
	
}
