package br.com.fiap.util;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;
import br.com.fiap.carga.Carga;
import br.com.fiap.cliente.Cliente;
import br.com.fiap.viagem.Viagem;

public class Util {
	
	private Viagem viagem = new Viagem();

	// metodo para exibir o menu de opcoes
	public void menu() {
		int opcao;

		do {
			opcao = parseInt(showInputDialog(gererMenu()));
			if (opcao < 1 || opcao > 6) {
				showMessageDialog(null, "Opcao invalida");
			} else {
				switch (opcao) {
				case 1:
					reservar();
					break;
				case 3:
					visualizar();
					break;
				}
			}
		} while (opcao != 6);
	}

	private void visualizar() {
		showMessageDialog(null, viagem.getDados());
		

	}

	// metodo para entrar com os dados e realizar a rezerva
	private void reservar() {
		int cnpj;
		String nomeCliente;
		String destino;

		cnpj = parseInt(showInputDialog("CNPJ"));
		nomeCliente = showInputDialog("Nome do cliente");
		destino = showInputDialog("Destino");

		Cliente cliente = new Cliente(cnpj, nomeCliente);
		Carga carga = new Carga(destino, cliente);
		if(viagem.reservar(carga)) 
			showMessageDialog(null, "Carga Reservada com sucesso");
		else
			showMessageDialog(null, "Problemas ao reservar a carga");

	}

	// metodo para gerar o texto do menu
	private String gererMenu() {
		String aux = "Sistema de reserva de cargas \n\n";
		aux += "1. Realizar reserva\n";
		aux += "2. Pesquisar reserva\n";
		aux += "3. Visualizar reserva\n";
		aux += "4. Capacidade reservada\n";
		aux += "5. Cancelar reserva\n";
		aux += "6. Encerrar Programa\n";
		return aux;
	}

}
