package com.slug.crudJPA.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slug.crudJPA.model.Cargo;
import com.slug.crudJPA.repository.CargoRepository;

@Service
public class CargoService {

	@Autowired
	private CargoRepository repo;
	
	public List<Cargo> listAll(){
		return repo.findAll();
	}
	
	public void save(Cargo cargo) {
		repo.save(cargo);
	}
	
	public Cargo getCargo(Long id) {
		return repo.findById(id).get();
	}
	
	public void deleteCargo(Long id) {
		repo.deleteById(id);
	}
}
