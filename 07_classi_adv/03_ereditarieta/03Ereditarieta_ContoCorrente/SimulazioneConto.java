/* 
   Vengono definiti 10 correntisti. Ogni giorno un qualunque numero
   di loro puo' effettuare un'operazione (o di deposito o di prelievo),
   Dopo 30 giorni viene stampato l'estratto conto di ciascun correntista.
*/


public class SimulazioneConto {

    public static void main(String[] a) {
	String[] nomi = {"Ada", "Ido", "Carlo", "Giulia", "Fabia", 
                         "Lidia", "Anna", "Mario", "Mario", "John"};

	String[] cognomi = {"Tripcovich", "Kuszmankiwsi", "Iok", "Rossi", 
                            "Bianchi", "Tuk", "Tik", "Tok", "Tak", "Oxa"};

	double[] depUtenti = {100, 200, 4000, 394.5, 20, 123.75, 12, 400, 
			      244.15, 234};

	Conto[] correntisti = new Conto[10];

	for (int i = 0; i < 10; i++) {
	    correntisti[i] = new Conto(nomi[i], cognomi[i], depUtenti[i]);
	}

	// simulo le operazioni dei correntisti in 30 giorni:

	for (int i = 1; i <= 30; i++) {
	    // scelgo un numero di correntisti che fanno l'operazione
	    // all'i-imo giorno:
	    int numUtenti = (int)(Math.random()*10);
	    for (int j = 0; j < numUtenti; j++) {
		// scelgo un correntista a caso tra i 10 definiti:
		int posizione = (int)(Math.random()*10);
		// il correntista scelto puo' depositare o ritirare
		// una somma a caso tra 10 e 200 euro. 
		int operaz = (int)(Math.random()*2);
		// se operaz vale 0 deposita, se vale 1 ritira:
		if (operaz == 0)
		    correntisti[posizione].deposita(10 + Math.random()*190);
		else 
		    correntisti[posizione].ritira(10 + Math.random()*190);
	    }

	}
	// trascorsi i 30 giorni stampo gli estratti conto dei 
	// 10 correntisti:

	for (int i = 0; i < 10; i++) {
	    System.out.println("***");
	    System.out.println(correntisti[i].registroOperazioni());
	}


    }

}
