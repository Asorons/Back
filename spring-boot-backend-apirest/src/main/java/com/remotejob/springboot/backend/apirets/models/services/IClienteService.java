package com.remotejob.springboot.backend.apirets.models.services;

import java.util.List;

import com.remotejob.springboot.backend.apirets.models.entity.Cliente;

public interface IClienteService {
	
	public List<Cliente> findAll();
	
	public Cliente findById(Long id);
	
	public Cliente save(Cliente cliente);
	
	public void delete(Long id);
}
