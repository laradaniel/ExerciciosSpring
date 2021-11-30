package br.org.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
	
	@GetMapping
	public String helloShow() {
		return "Hello Família 38! Meu primeiro Spring :)"
				+ "\nPara concluir foi preciso muita persistência e atenção aos detalhes!";
	}
	
}
