package com.rafu.workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rafu.workshop.dominio.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
