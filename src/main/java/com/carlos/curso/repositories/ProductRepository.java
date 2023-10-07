package com.carlos.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carlos.curso.entities.Product;
import com.carlos.curso.entities.User;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
