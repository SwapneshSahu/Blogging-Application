package com.blogging.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.blogging.model.Category;

@Repository
public interface CategoryRepo extends JpaRepository<Category, Integer> {

}
