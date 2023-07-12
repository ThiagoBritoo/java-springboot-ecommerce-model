package com.shadowcorp.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shadowcorp.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
