package com.rafu.workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rafu.workshop.dominio.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
