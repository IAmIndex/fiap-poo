package br.com.fiapride.model;

public class GarrafaTermica extends Garrafa {
	final private double constanteResfriamento = 0.013; // Valor fictício assumido
	
	public GarrafaTermica(int tamanhoCm, int capacidadeMaxMl, Liquido liquido) {
		super(tamanhoCm, capacidadeMaxMl, liquido);		
	}
	
	@Override
	public void variarTemperatura(double temperaturaAmbiente, double tempoPassadoHora) {
		// Caso esteja aberto, soma um valor arbitrário à constante de resfriamento.
		// Feito meramente como uma desculpa para utilizar polimorfismo
		this.liquido.setTemperatura(temperaturaAmbiente, tempoPassadoHora, this.constanteResfriamento + (0.09 * Boolean.valueOf(this.estaAberta).compareTo(false)));
	}
	
}
