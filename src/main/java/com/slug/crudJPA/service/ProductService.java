package com.slug.crudJPA.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slug.crudJPA.model.Product;
import com.slug.crudJPA.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepo;
	
	public List<Product> listAll(){
		return productRepo.findAll();
	}
	
	public void save(Product p) {
		productRepo.save(p);
	}
	
	public Product getProduct(Long id) {
		return productRepo.findById(id).get();
	}
	
	public void deleteProduct(Long id) {
		productRepo.deleteById(id);
	}
}
