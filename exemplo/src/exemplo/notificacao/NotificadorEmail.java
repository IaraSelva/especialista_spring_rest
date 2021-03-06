package exemplo.notificacao;

import exemplo.Cliente;

public class NotificadorEmail implements Notificador{
	
	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("Notificando %s pelo e-mail %s: \n%s\n",
							cliente.getNome(),
							cliente.getEmail(),
							mensagem);
	}

}
