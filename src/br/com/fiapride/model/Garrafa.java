package br.com.fiapride.model;

public class Garrafa {
	public int tamanhoCm;
    public int capacidadeMaxMl;
    public String liquido;
    public boolean estaAberta = false;
    
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
}
