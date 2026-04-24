package br.com.fiapride.model;

import java.lang.Math;

public class Liquido {
	final private String nome;
	private double temperaturaC;
	
	public Liquido(String nome, double temperaturaC) {
		this.nome = nome;
		this.temperaturaC = temperaturaC;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public double getTemperatura() {
		return this.temperaturaC;
	}
	
	public void setTemperatura(double tempAmbiente, double tempoHora, double constanteResfriamento) {
		if (tempoHora < 0) {
			System.out.println("Valor de tempo inválido!");
			return;
		}
		
		this.temperaturaC = tempAmbiente + (this.temperaturaC - tempAmbiente)*Math.exp((-constanteResfriamento)*tempoHora);
	}
}
