package it.itiscastelli.bolloauto4;

public class Camion extends VeicoloMotorizzato {
	int pesoAVuoto;
	
	public Camion(String targa, String modello, int pesoAVuoto) {
		super(targa, modello);
		this.pesoAVuoto = pesoAVuoto;
	}
	
	@Override 
	public String toString() {
		return super.toString()+ ", peso a vuoto " + pesoAVuoto + " tonnellate";
	}

}
