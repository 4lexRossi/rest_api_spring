package com.alostech.api.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alostech.domain.model.Client;

@RestController
public class ClientController {
	
	@PersistenceContext
	private EntityManager manager;
	
	@GetMapping("/clients")
	public List<Client> list() {
		return manager.createQuery("from api.Client", Client.class)
				.getResultList();
		
	}

}
