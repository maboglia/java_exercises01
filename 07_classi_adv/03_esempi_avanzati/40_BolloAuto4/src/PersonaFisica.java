package it.itiscastelli.bolloauto4;

public class PersonaFisica extends Proprietario {
	String nome;
	String indirizzo;
	
	public PersonaFisica(String codiceFiscale, String nome, String indirizzo) {
		super(codiceFiscale);
		this.nome = nome;
		this.indirizzo = indirizzo;
	}
	
	@Override
	public String toString() {
		return super.codiceFiscale + ", " + nome + ", " + indirizzo;
	}

}
