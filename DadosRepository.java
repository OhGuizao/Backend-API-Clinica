package br.com.guilherme.clinica.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.guilherme.clinica.model.Cliente;

public interface DadosRepository extends JpaRepository<Cliente, Long>{
	
	
	
}
