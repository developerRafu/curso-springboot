package com.rafu.workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rafu.workshop.dominio.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
