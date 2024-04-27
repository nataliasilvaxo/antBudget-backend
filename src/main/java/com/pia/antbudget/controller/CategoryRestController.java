package com.pia.antbudget.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pia.antbudget.response.CategoryResponseRest;
import com.pia.antbudget.services.ICategoryService;

@RestController
@RequestMapping("/api/v1")//esta uri sirve para identificar que servicio se va a consumir
public class CategoryRestController {
	//Se exponen los servicios como rest
	@Autowired
	private ICategoryService service;
	
	@GetMapping("/categories")
	public ResponseEntity<CategoryResponseRest> searchCategories(){
		ResponseEntity<CategoryResponseRest> response = service.search();
		return response;
	}
}
