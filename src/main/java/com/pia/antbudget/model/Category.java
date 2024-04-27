package com.pia.antbudget.model;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="category")
@Data
public class Category implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id //Este es para el ID de la clase
	@GeneratedValue(strategy = GenerationType.IDENTITY) //Este es para que el id sea autoincrementable
	private Long id;
	private String name;
	private String description;
	
	
}
