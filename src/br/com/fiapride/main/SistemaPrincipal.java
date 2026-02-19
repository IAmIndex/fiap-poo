package br.com.fiapride.main;

import br.com.fiapride.model.*;

public class SistemaPrincipal {
	public static void main(String args[]) {
		Passageiro passageiro1 = new Passageiro();
		
		passageiro1.nome = "Ana Silva";
		passageiro1.saldo = 50.0;
		
		Passageiro passageiro2 = new Passageiro();
				
		passageiro2.nome = "Carlos Souza";
		passageiro2.saldo = 12.50;
		
		System.out.println("--- Sistema FiapRide ---");
		System.out.println("Passageiro: " + passageiro1.nome + " | Saldo: R$" + passageiro1.saldo);
		System.out.println("Passageiro: " + passageiro2.nome + " | Saldo: R$" + passageiro2.saldo);
		
		// Teste paralelo (para não criar em outro lugar)
		Garrafa garrafa1 = new Garrafa();
		
		garrafa1.capacidadeMaxMl = 500;
		garrafa1.tamanhoCm = 100;
		garrafa1.liquido = "Pedra";
		
		garrafa1.beber();
		garrafa1.abrir();
		garrafa1.beber();
		garrafa1.fechar();
		garrafa1.beber();
	}
}
