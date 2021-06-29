package com.algaworks.algafood.service;

import com.algaworks.algafood.modelo.Cliente;
import com.algaworks.algafood.notificacao.Notificador;
import org.springframework.stereotype.Component;

public class AtivacaoClienteService {
	
	private Notificador notificador;
	
	public AtivacaoClienteService (Notificador notificador) {
		this.notificador = notificador;

		System.out.println("Ativação cliente service " + notificador);
	}


	public void ativar (Cliente cliente) {
		cliente.ativar();

		notificador.notificar(cliente, "Seu cadastro foi ativado.");
	}
}
