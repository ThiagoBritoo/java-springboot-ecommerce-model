package com.ecommerce.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
