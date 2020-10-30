package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping("/hello")
	public String hello() {
		return "Hello Generation!";
	}
	
	@RequestMapping("/atividade1")
	public String atividade1() {
		return "Mentalidades: Orientação ao futuro e persistência. \nHabilidades: Orientação ao detalhe";
	}
	
	@RequestMapping("/atividade2")
	public String atividade2() {
		return "Objetivos da semana: MySQL, REST, RESTful\nBanco de Dados: select, insert, delete, update, inner join, left join, right join\n"
				+ "REST/RESTful: Métodos e status http, camadas";
	}
	
}