package com.alostech.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.alostech.domain.model.Client;

 
@EnableJpaRepositories("com.alostech.domain.repository.ClientRepository") 
@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
