package com.blogging.services;

import java.util.List;

import com.blogging.payLoad.CategoryDto;

public interface CategoryService {

	
	CategoryDto createCategory(CategoryDto category);
	CategoryDto updateCategory(CategoryDto category ,Integer categoryId);
	CategoryDto getCategoryByID(Integer categoryId);
	List<CategoryDto> getAllCategory();
	
	void deleteCategory(Integer categoryId);
}
