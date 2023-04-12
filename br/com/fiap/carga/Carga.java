package br.com.fiap.carga;

import java.util.Random;

import br.com.fiap.cliente.Cliente;

public class Carga {
	
	private int id;
	private String destino;
	private double peso;
	private Cliente cliente;
	
	
	
	public Carga(String destino, Cliente cliente) {
		super();
		this.destino = destino;
		this.cliente = cliente;
		this.id = gerarId();
		this.peso = gerarPeso();
	}

	private double gerarPeso() {
		Random rand = new Random();
		return rand.nextDouble(1000 ,3001);
		
	}

	private int gerarId() {
		Random rand = new Random();
		return rand.nextInt( 1000 , 10000);
		
	}	
	
	//metodo para retornar os metodos da carga
	
	public String getDados() {
		String aux = "";
		aux += "ID: " + id + "\n";
		aux += "Destino: " + destino + "\n";
		aux += "Peso: " + String.format("%.4f", peso) + "\n";
		aux += "Cliente: " + cliente.getCliente() + "\n";
		aux += "CNPJ: " + cliente.getCnpj() + "\n";
		
		return aux;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
	
	
	

	
	
}
