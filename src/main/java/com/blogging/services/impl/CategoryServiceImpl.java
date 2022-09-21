package com.blogging.services.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blogging.exception.ResourceNotFoundException;
import com.blogging.model.Category;
import com.blogging.payLoad.CategoryDto;
import com.blogging.repo.CategoryRepo;
import com.blogging.services.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private CategoryRepo categoryRepo;

	@Autowired
	private ModelMapper modelMapper;

	@Override
	public CategoryDto createCategory(CategoryDto categoryDto) {
		Category category = this.dtoToCategory(categoryDto);
		Category savedCategory = this.categoryRepo.save(category);
		return this.categoryToDto(savedCategory);
	}

	@Override
	public CategoryDto updateCategory(CategoryDto categoryDto, Integer categoryId) {
		Category category = this.categoryRepo.findById(categoryId)
				.orElseThrow(() -> new ResourceNotFoundException("Category", "id", categoryId));

	//	category.setCategoryid(categoryDto.getCategoryid());
		category.setCategoryDiscription(categoryDto.getCategoryDiscription());
		category.setCategoryTitle(categoryDto.getCategoryTitle());
 
		
		
		Category savedCategory = this.categoryRepo.save(category);

		return this.categoryToDto(savedCategory);

	}

	@Override
	public CategoryDto getCategoryByID(Integer categoryId) {
		Category category = this.categoryRepo.findById(categoryId)
				.orElseThrow(() -> new ResourceNotFoundException("Category", "id", categoryId));
		return this.categoryToDto(category);
	}

	@Override
	public List<CategoryDto> getAllCategory() {
		List<Category> categorys = this.categoryRepo.findAll();

		List<CategoryDto> categoryDto = categorys.stream().map(category -> this.categoryToDto(category))
				.collect(Collectors.toList());
		return categoryDto;
	}

	@Override
	public void deleteCategory(Integer categoryId) {
		Category category = this.categoryRepo.findById(categoryId)
				.orElseThrow(() -> new ResourceNotFoundException("Category", "id", categoryId));
		this.categoryRepo.delete(category);
		
	}

	private Category dtoToCategory(CategoryDto categoryDto) {
		Category category = this.modelMapper.map(categoryDto, Category.class);
		return category;
	}

	private CategoryDto categoryToDto(Category category) {

		CategoryDto categoryDto = this.modelMapper.map(category, CategoryDto.class);

		return categoryDto;

	}
}
