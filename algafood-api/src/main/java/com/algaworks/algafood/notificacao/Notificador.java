package com.algaworks.algafood.notificacao;

import com.algaworks.algafood.modelo.Cliente;

public interface Notificador {
	
	public void notificar (Cliente cliente, String mensagem);

}
