package com.ecommerce.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
