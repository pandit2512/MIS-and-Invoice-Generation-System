package com.codeB.MIS_Invoice_generation_system.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codeB.MIS_Invoice_generation_system.entity.User;
import com.codeB.MIS_Invoice_generation_system.repository.UsersRepository;

@Service
public class UsersService {

	@Autowired
	private UsersRepository usersRepository;

	public String register(User request) {
        if (usersRepository.existsByEmail(request.getEmail())) {
            throw new RuntimeException("Email already exists");
        }
}
