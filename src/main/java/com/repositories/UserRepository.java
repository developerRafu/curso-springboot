package com.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dominio.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
