package br.com.fiapride.main;

import br.com.fiapride.model.*;

public class SistemaPrincipal {
	public static void main(String args[]) {
		Garrafa garrafa1 = new Garrafa(100, 500, "Pedra");
		
		garrafa1.beber();
		garrafa1.abrir();
		garrafa1.beber();
		garrafa1.fechar();
		garrafa1.beber();
	}
}
