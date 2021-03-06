package exemplo.service;

import exemplo.Cliente;
import exemplo.Produto;
import exemplo.notificacao.Notificador;

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
