package classi01.innestate;

import model.Ruolo;
import model.Squadra;

public class EnumClasses {

	public static void main(String[] args) throws Exception {

		Squadra jar = new Squadra();
		jar.addGiocatore("Messi",Ruolo.ATTACCANTE, 10);
		jar.addGiocatore("Modric",Ruolo.CENTROCAMPISTA, 8);
		jar.addGiocatore("",Ruolo.DIFENSORE, 3);
		jar.reportSquadra();
	}
	
}
