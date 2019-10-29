package com.slug.crudJPA.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.slug.crudJPA.model.Cargo;

public interface CargoRepository extends JpaRepository<Cargo, Long> {

}