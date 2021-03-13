package com.alostech.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alostech.domain.model.Client;

@RestController
public class ClientControler {
	
	@GetMapping("/clients")
	public List<Client> list() {
		var client1 = new Client();
		client1.setId(1L);
		client1.setName("Jack the reaper");
		client1.setTelefone("19 99999-9999");
		client1.setEmail("jack@email.com");
		
		var client2 = new Client();
		client2.setId(2L);
		client2.setName("Mary go around");
		client2.setTelefone("19 98888-9999");
		client2.setEmail("Mary@email.com");
		
		return Arrays.asList(client1, client2);
	}

}
