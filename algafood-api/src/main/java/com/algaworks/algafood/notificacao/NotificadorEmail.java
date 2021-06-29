package com.algaworks.algafood.notificacao;

import com.algaworks.algafood.modelo.Cliente;

public class NotificadorEmail implements Notificador{

	private boolean caixaAlta;
	private String hotServidorSmtp;

	public NotificadorEmail(String hotServidorSmtp) {
		this.hotServidorSmtp = hotServidorSmtp;

		System.out.println("Notificador email");
	}
	
	@Override
	public void notificar(Cliente cliente, String mensagem) {
		if(this.caixaAlta){
			mensagem = mensagem.toUpperCase();
		}

		System.out.printf("Notificando %s pelo e-mail %s no SMTP %s : \n%s\n",
							cliente.getNome(),
							cliente.getEmail(),
							this.hotServidorSmtp,
							mensagem);
	}


	public boolean getCaixaAlta() {
		return caixaAlta;
	}

	public void setCaixaAlta(boolean caixaAlta) {
		this.caixaAlta = caixaAlta;
	}

	public String getHotServidorSmtp() {
		return hotServidorSmtp;
	}

	public void setHotServidorSmtp(String hotServidorSmtp) {
		this.hotServidorSmtp = hotServidorSmtp;
	}
}
