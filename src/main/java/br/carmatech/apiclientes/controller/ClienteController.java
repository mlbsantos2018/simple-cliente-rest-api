package br.carmatech.apiclientes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.carmatech.apiclientes.model.Cliente;
import br.carmatech.apiclientes.repository.ClienteRepository;

@RestController
@RequestMapping(path= "/cliente")
public class ClienteController {
	
	@Autowired
	ClienteRepository clienteRepository;
	
	@PostMapping("/salva")
	public Cliente salva(@RequestBody Cliente cliente) {
		return clienteRepository.save(cliente);
	}
	
	@GetMapping("/lista")
	public List<Cliente> findAll() {
		return clienteRepository.findAll();
	}
}
