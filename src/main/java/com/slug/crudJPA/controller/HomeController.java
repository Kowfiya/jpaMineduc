package com.slug.crudJPA.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping("/")
	public String home() {
		return "home";
	}
	
	@GetMapping("/presupuestos")
	public String presupuestos() {
		return "presupuesto"; 
	}
	
	@GetMapping("/orden-administrativa")
	public String oa() {
		return "oa"; 
	}
	
	@GetMapping("/documentos-financieros")
	public String docFin() {
		return "docfinancieros"; 
	}
	
	@GetMapping("/memorandums")
	public String memorandums() {
		return "memorandums"; 
	}
	
	@GetMapping("/digitalizacion")
	public String digitalizacion() {
		return "digitalizacion"; 
	}
	
	@GetMapping("/despacho-documentos")
	public String despachoDoc() {
		return "despachodoc"; 
	}
	
	@GetMapping("/mantenedores")
	public String mantenedor() {
		return "mantenedores";
	}
	

}
