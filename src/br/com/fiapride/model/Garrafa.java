package br.com.fiapride.model;

public class Garrafa {
	private int tamanhoCm;
    private int capacidadeMaxMl;
    public Liquido liquido;
    public boolean estaAberta = false;
    
    public Garrafa(int tamanhoCm, int capacidadeMaxMl, Liquido liquido) {
    	this.setTamanhoCm(tamanhoCm);
    	this.setCapacidadeMaxMl(capacidadeMaxMl);
    	this.liquido = liquido;
    }
    
    public void abrir() {
        this.estaAberta = true;
    }
    
    public void fechar() {
        this.estaAberta = false;
    }
    
    public void beber() {
        if (this.estaAberta) {
            System.out.println("Glub glub glub");
        } else {
            System.out.println("Você bateu os dentes contra a tampa da garrafa");
        }
    }
    
    public int getTamanho() {
    	return this.tamanhoCm; 
    }
    
    public int getCapacidade() {
    	return this.capacidadeMaxMl;
    }
    
    private void setTamanhoCm(int tamanhoCm) {
    	if (tamanhoCm < 0) {
    		System.out.println("Tamanho inválido!");
    		return;
    	}
    	
    	this.tamanhoCm = tamanhoCm;
    }
    
    private void setCapacidadeMaxMl(int capacidadeMaxMl) {
    	if (capacidadeMaxMl < 0) {
    		System.out.println("Capacidade inválida!");
    		return;
    	}
    	this.capacidadeMaxMl = capacidadeMaxMl;
    }
}
