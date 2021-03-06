package exemplo.di;

import exemplo.Cliente;
import exemplo.Produto;
import exemplo.notificacao.Notificador;
import exemplo.notificacao.NotificadorEmail;
import exemplo.service.AtivacaoClienteService;
import exemplo.service.EmissaoNotaFiscal;

public class Main {

	public static void main(String[] args) {

		Cliente joao = new Cliente("Jo?o", "joao@joao.com", "15436987774");
		
		Cliente maria = new Cliente("Maria", "maria@maria.com" , "44485632145");
		
		Produto tenis = new Produto("t?nis", 145.77);
		
		Notificador email = new NotificadorEmail();
		
		EmissaoNotaFiscal emitir = new EmissaoNotaFiscal(email);
		
		AtivacaoClienteService ativacao = new AtivacaoClienteService(email);
		ativacao.ativar(maria);
		ativacao.ativar(joao);
		
		emitir.emitir(maria, tenis);
		
		
	}

}
