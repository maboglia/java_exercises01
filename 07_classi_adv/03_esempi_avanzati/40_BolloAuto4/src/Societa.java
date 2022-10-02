package it.itiscastelli.bolloauto4;

public class Societa extends Proprietario {
	String partitaIva;
	String ragioneSociale;
	String sede;
	
	public Societa(String codiceFiscale, String partitaIva, String sede) {
		super(codiceFiscale);
		this.partitaIva = partitaIva;
		this.sede = sede;
	}

	@Override 
	public String toString() {
		return super.toString() + ", partita IVA " + partitaIva + ", sede " + sede;
	}
	
}
