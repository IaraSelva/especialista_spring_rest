package com.algaworks.algafood.controller;

import com.algaworks.algafood.modelo.Cliente;
import com.algaworks.algafood.service.AtivacaoClienteService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PrimeiroController {

	private AtivacaoClienteService ativacaoClienteService;

	public PrimeiroController(AtivacaoClienteService ativacaoClienteService){
		this.ativacaoClienteService = ativacaoClienteService;
		System.out.println("Controller " + ativacaoClienteService);
	}
	
	@GetMapping("/hello")
	@ResponseBody
	public String hello() {
		Cliente joao = new Cliente("João", "joao@joao.com", "45522369877");

		ativacaoClienteService.ativar(joao);

		return "Hello";
	}

}
