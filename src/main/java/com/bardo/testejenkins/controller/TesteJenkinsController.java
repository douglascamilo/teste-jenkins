package com.bardo.testejenkins.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mensagem")
public class TesteJenkinsController {
	@Value("${mensagem.valor}") private String mensagem;

	@GetMapping
	public String getMessage() {
		return mensagem;
	}
}