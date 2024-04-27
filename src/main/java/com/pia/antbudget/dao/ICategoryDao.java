package com.pia.antbudget.dao;

import org.springframework.data.repository.CrudRepository;

import com.pia.antbudget.model.Category;

public interface ICategoryDao extends CrudRepository<Category, Long>{
	
}
