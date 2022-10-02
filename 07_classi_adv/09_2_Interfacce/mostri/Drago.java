package it.bogliaccino.mostri;

import it.bogliaccino.mostri.interfacce.Letale;
import it.bogliaccino.mostri.interfacce.MostroPericoloso;

public class Drago implements MostroPericoloso, Letale{
	
	
	String nome = null;	
	public Drago(String nome) {
		
		this.nome = nome;
		System.out.println("ti spiezzo in due!!");
	}

	@Override
	public void distruggi() {
		System.out.println("Ora ti distruggo!!!");
		
	}

	@Override
	public void uccidi() {
		System.out.println("Ora ti uccido al brucio!!!");
		
	}
}
