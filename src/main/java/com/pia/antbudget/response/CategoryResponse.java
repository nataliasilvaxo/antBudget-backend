package com.pia.antbudget.response;

import java.util.List;

import com.pia.antbudget.model.Category;

import lombok.Data;

@Data
public class CategoryResponse {
	
	private List<Category> category;

}
