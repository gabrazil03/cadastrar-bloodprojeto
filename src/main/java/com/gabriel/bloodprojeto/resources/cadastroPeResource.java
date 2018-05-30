package com.gabriel.bloodprojeto.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/CadastrarPessoa")

public class cadastroPeResource {
	
	@RequestMapping(method = RequestMethod.GET)
	private String Cadastrar() {
		return "Teste do rest";
	}
	
	
}
