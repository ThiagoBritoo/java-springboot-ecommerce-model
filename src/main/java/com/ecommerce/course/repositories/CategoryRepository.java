package com.ecommerce.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
