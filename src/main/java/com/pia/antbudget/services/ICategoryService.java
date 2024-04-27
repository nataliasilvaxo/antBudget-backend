package com.pia.antbudget.services;

import org.springframework.http.ResponseEntity;

import com.pia.antbudget.response.CategoryResponseRest;

public interface ICategoryService {
	
	public ResponseEntity<CategoryResponseRest> search();
	
}
