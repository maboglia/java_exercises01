/*
  Questa classe testa le classi Veicolo, Auto, Moto e Camion.
*/


public class TestVeicolo {

    public static void main(String[] arg) {

	Auto miaAuto = new Auto();
	miaAuto.assegnaProprietario("Luca");
	miaAuto.assegnaMatricola(1234);

	miaAuto.assegnaTipo("Sport");

	Camion camion1 = new Camion();

	camion1.assegnaProprietario("Anna");
	camion1.assegnaMatricola(34231);

	camion1.assegnaAssi(3);

	Moto moto1 = new Moto();
	moto1.assegnaProprietario("Valentino");
	moto1.assegnaMatricola(8765);

	moto1.assegnaNumPosti(2);

	//
	System.out.println("Auto di: " + miaAuto.dammiProprietario() 
			   + "\nTipo dell'auto: " + miaAuto.dammiTipo());
	System.out.println("Camion di: " + camion1.dammiProprietario() 
			   + "\nnumero matricola: " 
			   + camion1.dammiMatricola() +
			   "\nnumero assi: " + camion1.dammiAssi());
	System.out.println("Moto di: " + moto1.dammiProprietario() 
			   + "\nnumero matricola: " 
			   + moto1.dammiMatricola() +
			   "\nnumero posti: " + moto1.dammiNumPosti());

	// un oggetto di tipo Veicolo puo' riferirsi ad un qualunque
	// oggetto di una sottoclasse di Veicolo, quindi ad esempio 
	// ad un oggetto di tipo Moto (o Auto o Camion).

	Veicolo unVeicolo = new Veicolo();
	unVeicolo = moto1;

	// l'operatore "instanceof" ritorna il valore true o false, 
	// a seconda se l'oggetto scritto a sinistra dell'operatore
	// e' o no un oggetto della classe scritta a destra dell'
	// operatore. 

	if (unVeicolo instanceof Moto) 
	    System.out.println("\nIl veicolo e' una moto!\n");


	// Se alla seguente istruzione viene tolto il commento, il compilatore
	// segnala un errore.

	// System.out.println(unVeicolo.dammiNumPosti()); // errato!

	// Sapendo che l'oggetto "unVeicolo" si riferisce ad un oggetto
	// di tipo Moto, si puo' fare un cast (forzatura) per convertirlo
	// e quindi per usare poi tutti i metodi della classe Moto.

	Moto moto2 = (Moto)unVeicolo;
	System.out.println(moto2.dammiNumPosti()); // corretto

    }

}
