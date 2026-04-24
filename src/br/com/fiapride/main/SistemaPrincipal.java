package br.com.fiapride.main;

import br.com.fiapride.model.*;

public class SistemaPrincipal {
	public static void main(String args[]) {
		Garrafa garrafa1 = new Garrafa(100, 500, new Liquido("Água", 20));
		
		GarrafaTermica garrafa2 = new GarrafaTermica(200, 750, new Liquido("Suco", 15));
		
		final double temperaturaAmbiente = 25.0;
		
		garrafa1.beber();
		garrafa1.abrir();
		garrafa1.beber();
		garrafa1.fechar();
		garrafa1.beber();
		
		garrafa1.variarTemperatura(temperaturaAmbiente, 1);
		garrafa2.variarTemperatura(temperaturaAmbiente, 1);
		
		System.out.print("Depois de deixar as garrafas por 1 hora parada em temperatura ambiente, a água ficou a ");
		System.out.print(String.format("%.2f", garrafa1.getLiquido().getTemperatura()) + "°C ");
		System.out.print("e o suco ficou a ");
		System.out.println(String.format("%.2f", garrafa2.getLiquido().getTemperatura()) + "°C ");
	}
}
