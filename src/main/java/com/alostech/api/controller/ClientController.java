package com.alostech.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alostech.domain.model.Client;
import com.alostech.domain.repository.ClientRepository;

@EnableJpaRepositories("com.alostech.domain.repository.ClientRepository") 
@RestController
public class ClientController {
	
	@Autowired
	private ClientRepository clientRepository; 
	
	@GetMapping("/clients")
	public List<Client> list() {
		return clientRepository.findAll();
	}

}
