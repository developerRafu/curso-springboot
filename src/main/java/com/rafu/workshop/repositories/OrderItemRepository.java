package com.rafu.workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rafu.workshop.dominio.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
