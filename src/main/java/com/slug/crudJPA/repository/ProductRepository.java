package com.slug.crudJPA.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.slug.crudJPA.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
