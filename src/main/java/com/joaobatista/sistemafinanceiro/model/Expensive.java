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
@Table(name = "tbl_expensive")
public class Expensive {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_expensive", nullable = false, unique = true)
	private Long idExpensive;
	
	@Column(name = "description_expensive", nullable = false, length = 200)
	private String descriptionExpensive;
	
	@Column(name = "value_expensive", nullable = false)
	private Double valueExpensive;
	
	@Column(name = "date_expensive", nullable = false)
	private LocalDate dateExpensive;
	
	@Column(name = "observation_expensive", length = 200)
	private String observationExpensive;
	
	@Column(name = "creation_expensive", nullable = false)
	private LocalDate creationExpensive;
	
	@ManyToOne
	@JoinColumn(name = "id_user", nullable = false)
	private User expensiveUser;
	
	@ManyToOne
	@JoinColumn(name = "id_category", nullable = false)
	private Category expensiveCategory;
	
	

	
	
}
