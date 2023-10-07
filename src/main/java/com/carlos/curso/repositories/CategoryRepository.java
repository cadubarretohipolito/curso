package com.carlos.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carlos.curso.entities.Category;
import com.carlos.curso.entities.User;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
