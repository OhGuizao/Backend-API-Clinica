package br.com.guilherme.clinica.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.guilherme.clinica.model.Cliente;
import br.com.guilherme.clinica.repository.DadosRepository;


/*
 * Em nosso projeto iremos fazer algumas antações(Annotations)
 * que são elementos de tipificação de código, ou seja, são aplicações
 * que fazemos no código para informar o que aquela linha ou grupo de
 * comando deve fazer e como deve ser entendido.
 * 
 * No caso abaixo, estamos dizendo que nossa classe Dados é um controlador 
 * de fluxo que receberá comandos em Rest e Responderá dados no formato Rest. 
 */

@RestController
@RequestMapping("/")
public class Dados {
	@Autowired
	private DadosRepository dr;
	
	@PostMapping("/cad")
	public String cadastro(@RequestBody Cliente cliente) {
		dr.save(cliente);
		return "Cliente cadastrado com sucesso";
	
		
	}
	
	@GetMapping("/clientes")
	public List<Cliente> clientes(){
		return dr.findAll();
	}
}