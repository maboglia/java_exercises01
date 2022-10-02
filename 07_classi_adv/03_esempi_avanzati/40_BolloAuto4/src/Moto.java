package it.itiscastelli.bolloauto4;

public class Moto extends VeicoloMotorizzato {
	enum Motore {
		DueTempi, QuattroTempi;
	};
	
	Motore motore;
	
	public Moto(String targa, String modello, Motore motore) {
		super(targa, modello);
		this.motore = motore;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", motore " + motore + ". Proprietario con codice fiscale " + super.proprietario.codiceFiscale;
	}
}
