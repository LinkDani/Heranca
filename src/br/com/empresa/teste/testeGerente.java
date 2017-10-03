package br.com.empresa.teste;

import org.junit.Test;

import br.com.empresa.Gerente;

public class testeGerente {
	@Test
	public void TesteGerente(){
		Gerente gerente = new Gerente("Afonso", "29032001", 2000, 147258, 564);
	}
	
	@Test
	public void Autenticação(){
		Gerente gerente = new Gerente("João", "", 2000, 444456, 4868);
	}
}
