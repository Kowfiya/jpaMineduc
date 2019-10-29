package com.slug.crudJPA.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.slug.crudJPA.model.Cargo;
import com.slug.crudJPA.service.CargoService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
@RequestMapping("mantenedor/cargos")
public class CargosManenedorControler {
	@Autowired
	private CargoService service;

	ModelAndView mav = new ModelAndView();
	
	@GetMapping({"/index"})
	public ModelAndView home(Model m) {
		List<Cargo> cargos = service.listAll();
		mav.addObject("cargos", cargos);
		mav.setViewName("cargos/indexCargos");
		return mav;
	}
	
	@GetMapping("/new")
	public ModelAndView newCargo() {
		Cargo cargo = new Cargo();
		mav.addObject("cargo", cargo);
		mav.setViewName("cargos/newCargo");
		return mav;
	}
	
	@GetMapping("/editar/{id}")
	public ModelAndView updateCargo(@PathVariable(name = "id") long id) {
		Cargo cargo = service.getCargo(id);
		mav.addObject("cargo", cargo);
		mav.setViewName("cargos/edit");
		System.out.println("sadas");
		return mav;
	}
	
	@PostMapping("/save")
	public ModelAndView saveCargo(Cargo c) {
		service.save(c);
		return new ModelAndView("redirect:/mantenedor/cargos/index");
	}
	
	@PostMapping("/actualizar")
	public ModelAndView saveUpdateCargo(@ModelAttribute("cargo") Cargo c) {
		service.save(c);
		return new ModelAndView("redirect:/mantenedor/cargos/index");
	}
	
	@GetMapping("/delete")
	public ModelAndView deleteCargo() {
		return mav;
	}
}
