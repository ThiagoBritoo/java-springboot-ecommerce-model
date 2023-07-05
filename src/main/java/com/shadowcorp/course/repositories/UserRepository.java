package com.shadowcorp.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shadowcorp.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
