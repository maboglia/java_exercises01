package it.bogliaccino.mostri;

import it.bogliaccino.mostri.interfacce.Mostruso;

public class Troll implements Mostruso{

	
	
	String nome = null;	
	public Troll(String nome) {
		
		this.nome = nome;
	}

	
	@Override
	public void spaventa() {
		
		System.out.println("BUUUH!!!");
		
	}

}
