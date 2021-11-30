package br.org.generation.helloworld1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
	
	@GetMapping
	public String HelloMundo() {
		return "Hello Mundo! Meu segundo Spring :)"
				+ "\nEssa semana quero aprender a fazer um CRUD no Spring!";
	}

}
