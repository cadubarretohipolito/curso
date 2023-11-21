package com.carlos.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carlos.curso.entities.OrderItem;
import com.carlos.curso.entities.User;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
