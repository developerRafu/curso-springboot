package com.rafu.workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rafu.workshop.dominio.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
