package com.nttdata.bootcamp.Spring.starter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PruebaController{
	
	@Autowired
	private Saludo saludo;
	
	@GetMapping(path="/prueba")
	public String pruebaSaludo() {
		return saludo.mensajeSaludo();
	}
}