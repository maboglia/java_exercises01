package it.itiscastelli.bolloauto4;

public class Proprietario {
	String codiceFiscale;
	
	public Proprietario(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}
	
	@Override
	public String toString() {
		return codiceFiscale;
	}

}
