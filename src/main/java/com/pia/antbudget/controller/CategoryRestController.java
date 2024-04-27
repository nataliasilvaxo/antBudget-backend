package com.pia.antbudget.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pia.antbudget.model.Category;
import com.pia.antbudget.response.CategoryResponseRest;
import com.pia.antbudget.services.ICategoryService;

@RestController
@RequestMapping("/api/v1")//esta uri sirve para identificar que servicio se va a consumir
public class CategoryRestController {
	//Se exponen los servicios como rest
	@Autowired
	private ICategoryService service;
	
	//todas las categorias
	@GetMapping("/categories")
	public ResponseEntity<CategoryResponseRest> searchCategories(){
		
		ResponseEntity<CategoryResponseRest> response = service.search();
		return response;
	}
	
	//tener las categorias por id
	@GetMapping("/categories/{id}")
	public ResponseEntity<CategoryResponseRest> searchCategoriesById(@PathVariable Long id){
		
		ResponseEntity<CategoryResponseRest> response = service.searchById(id);
		return response;
	}
	
	//guardar las categorias
	@PostMapping("/categories")
	//en el parametro de entrada con el requestBody podemos recuperar lo que venga del cliente como objeto JSON
	public ResponseEntity<CategoryResponseRest> save(@RequestBody Category category){
		
		ResponseEntity<CategoryResponseRest> response = service.save(category);
		return response;
	}
	
	//actualizar las categorias
	@PutMapping("/categories/{id}")
	public ResponseEntity<CategoryResponseRest> update(@RequestBody Category category, @PathVariable Long id){
		
		ResponseEntity<CategoryResponseRest> response = service.update(category, id);
		return response;
	}
	
	//borrar una categoria
	@DeleteMapping("/categories/{id}")
	public ResponseEntity<CategoryResponseRest> delete(@PathVariable Long id){
		
		ResponseEntity<CategoryResponseRest> response = service.deleteById(id);
		return response;
	}
}
