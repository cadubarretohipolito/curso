package com.carlos.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carlos.curso.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
