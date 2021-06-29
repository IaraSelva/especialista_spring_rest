package com.algaworks.algafood.service;

import com.algaworks.algafood.modelo.Cliente;
import com.algaworks.algafood.modelo.Produto;
import com.algaworks.algafood.notificacao.Notificador;

public class EmissaoNotaFiscal {
		
		private Notificador notificador;

		public EmissaoNotaFiscal(Notificador notificador) {
			super();
			this.notificador = notificador;
		}
		
		public void emitir(Cliente cliente, Produto produto) {
			
			this.notificador.notificar(cliente, "Nota fiscal do produto "+
										produto.getNome()
										+" emitida");	
		}

}
