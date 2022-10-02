package it.itiscastelli.bolloauto4;
import it.itiscastelli.bolloauto4.Automobile.Classe;
import it.itiscastelli.bolloauto4.Automobile.Regione;
import it.itiscastelli.bolloauto4.Moto.Motore;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Proprietario rossi = new PersonaFisica("VSCRSS230157PUYT5","Vasco Rossi","Zocca, via Chi lo sa, 65");
		System.out.println(rossi.toString());
		
		VeicoloMotorizzato ferrariF40 = new  Automobile("KU737WE", "Ferrari F40 rosso metallizzato", Classe.Euro5, 200, Regione.EmiliaRomagna); 
		VeicoloMotorizzato guzzi = new Moto("AQ987FG","Moto Guzzi 4 tempi, 30 cilindri Sport", Motore.QuattroTempi);
		
		//ferrariF40.proprietario = rossi;
		//guzzi.proprietario = rossi;
		
		ferrariF40.setProprietario(rossi); // equivalenti agli assegnamenti precedenti
		guzzi.setProprietario(rossi); // stesso proprietario per i due veicoli precedenti
		
		System.out.println(ferrariF40.toString());
		System.out.println(guzzi.toString());
	}

}
