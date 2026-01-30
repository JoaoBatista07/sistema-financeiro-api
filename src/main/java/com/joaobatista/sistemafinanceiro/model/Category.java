package com.joaobatista.sistemafinanceiro.model;

import java.time.LocalDate;
import java.util.List;

import com.joaobatista.sistemafinanceiro.enums.TypeExpensives;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_category")
public class Category {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_category", nullable = false, unique = true)
	private Long idCategory;
	
	@Column(name = "name_category", nullable = false, length = 50)
	private String nameCategory;
	
	@Column(name = "description_category", length = 100)
	private String descriptionCategory;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "type_category", nullable = false)
	private TypeExpensives typeCategory;
	
	@Column(name = "creation_category", nullable = false)
	private LocalDate creationCategory;
	
	@OneToMany(mappedBy = "incomeCategory")
	private List<Income> listCategoryIncomes;
	
	@OneToMany(mappedBy = "expensiveCategory")
	private List<Expensive> listCategoryExpensives;
	
	@ManyToOne
	@JoinColumn(name = "id_user", nullable = false)
	private User userCategory;

}
