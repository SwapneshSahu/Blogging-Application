package com.blogging.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blogging.payLoad.CategoryDto;
import com.blogging.services.CategoryService;

@RestController
@RequestMapping("/api/category")
public class CategoryController {

	@Autowired
	private CategoryService categoryService;

	// POST - Create Category
	@PostMapping("/create")
	public ResponseEntity<CategoryDto> createCategory(@Valid @RequestBody CategoryDto categoryDto) {

		CategoryDto createCategoryDto = this.categoryService.createCategory(categoryDto);

		return new ResponseEntity<CategoryDto>(createCategoryDto, HttpStatus.CREATED);

	}

	// Put -update Category
	@PutMapping("/update/{id}")
	public ResponseEntity<CategoryDto> updateCategory( @Valid @RequestBody CategoryDto categoryDto, @PathVariable Integer id) {

		CategoryDto updateCategoryDto = this.categoryService.updateCategory(categoryDto, id);
		return new ResponseEntity<CategoryDto>(updateCategoryDto, HttpStatus.OK);

	}

	// DELETE - delete user
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> deleteCategory(@PathVariable Integer id) {

		this.categoryService.deleteCategory(id);
		return new ResponseEntity<>("Success", HttpStatus.OK);

	}

	// GET get Category by id
	@GetMapping("/byId/{id}")
	public ResponseEntity<CategoryDto> getCategoryByID(@PathVariable Integer id) {

		CategoryDto categoryDto = this.categoryService.getCategoryByID(id);
		return new ResponseEntity<CategoryDto>(categoryDto, HttpStatus.OK);

	}

	@GetMapping("/allCategory")
	public ResponseEntity<List<CategoryDto>> getAllCategory() {

		List<CategoryDto> categoryDto = this.categoryService.getAllCategory();

		return new ResponseEntity<List<CategoryDto>>(categoryDto, HttpStatus.OK);

	}
}
