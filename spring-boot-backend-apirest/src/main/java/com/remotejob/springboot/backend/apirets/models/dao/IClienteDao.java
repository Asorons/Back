package com.remotejob.springboot.backend.apirets.models.dao;
import org.springframework.data.repository.CrudRepository;
import com.remotejob.springboot.backend.apirets.models.entity.Cliente;

public interface IClienteDao extends CrudRepository<Cliente,Long>{
	
}
