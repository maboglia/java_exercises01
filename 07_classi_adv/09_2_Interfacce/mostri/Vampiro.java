package it.bogliaccino.mostri;

import it.bogliaccino.mostri.interfacce.Letale;
import it.bogliaccino.mostri.interfacce.Mostruso;

public class Vampiro implements Mostruso, Letale {

	
	
	String nome = null;	
	public Vampiro(String nome) {
		
		this.nome = nome;
	}

	
	@Override
	public void uccidi() {
		System.out.println("Io uccido succhiandoti il sangue!!!");
		
	}

	@Override
	public void spaventa() {
		System.out.println("Io spavento mostrandoti i denti pieni di sangue!!!");
		
		
	}

}
