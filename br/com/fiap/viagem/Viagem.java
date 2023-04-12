package br.com.fiap.viagem;

import br.com.fiap.carga.Carga;

public class Viagem {

	private double capacidade;
	private int index;
	private Carga[] carga;

	public Viagem() {
		this.capacidade = 10000;
		this.index = 0;
		this.carga = new Carga[20];

	}

	// metodopara reservar uma carga para transporte
	public boolean reservar(Carga carga) {
		if (permitidoReservar(carga.getPeso())) {
			this.carga[index] = carga;
			index++;
			return true;
		}
		return false;
	}

	// metodo para retornar a capacidade ja armazenada no navio
	public double capacidadeReservada() {
		double total = 0;
		for (int i = 0; i < index; i++) {
			total += carga[i].getPeso();
		}
		return total;
	}

	// metodo para verificar se é permitido fazer a reserva
	public boolean permitidoReservar(double peso) {
		if (index < carga.length && capacidadeReservada() + peso <= capacidade)
			return true;
		else
			return false;
	}
	
	//metodo para retornar os dados de todas as cargas reservadas
		public String getDados() {
			String aux = "";
			for (int i = 0; i < index; i++) {
				aux += carga[i].getDados() + "\n";
			}
			return aux;
		}

}
