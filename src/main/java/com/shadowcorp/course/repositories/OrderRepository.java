package com.shadowcorp.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shadowcorp.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
