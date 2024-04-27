package com.pia.antbudget.services;

import org.springframework.http.ResponseEntity;

import com.pia.antbudget.model.Category;
import com.pia.antbudget.response.CategoryResponseRest;

public interface ICategoryService {
	
	public ResponseEntity<CategoryResponseRest> search();
	public ResponseEntity<CategoryResponseRest> searchById(Long id);
	public ResponseEntity<CategoryResponseRest> save(Category category);
	public ResponseEntity<CategoryResponseRest> update(Category category, Long id);
}
