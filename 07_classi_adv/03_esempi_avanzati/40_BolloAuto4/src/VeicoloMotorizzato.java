package it.itiscastelli.bolloauto4;

public class VeicoloMotorizzato {
	Proprietario proprietario;
	String targa;
	int ruote;
	int cilindrata; 
	String aziendaProduttrice;
	String modello;
	
	public VeicoloMotorizzato(String targa, String modello) {
		this.targa = targa;
		this.modello = modello;
	}
	
	// metodo per assegnare il veicolo al suo relativo proprietario
	public void setProprietario(Proprietario p) {
		proprietario = p;
	}
	
	@Override
	public String toString() {
		return "Targa "+ targa + ", modello " + modello;
	}

}
