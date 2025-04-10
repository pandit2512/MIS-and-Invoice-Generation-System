package com.codeB.MIS_Invoice_generation_system.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codeB.MIS_Invoice_generation_system.entity.User;

public interface UsersRepository extends JpaRepository<User, Long> {
	
	Optional<User> findByEmail(String email);
	
    boolean existsByEmail(String email);
}
