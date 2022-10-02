/*
  Questa classe vuole testare la classe ContrattoTelefonico e le sue 
  sottoclassi ContrattoFisso e ContrattoMobile.
  Definiamo due utenti, uno fisso e uno mobile. i due utenti fanno 
  una serie di telefonate di un certo tempo, alla fine stampiamo le 
  loro bollette telefoniche.
*/

import java.util.Random;  // per generare numeri casuali

public class TestContrattoTelefonico {

    public static void main(String[] arg) {

	Random generatoreRandom = new Random();

	ContrattoFisso utente1 = new ContrattoFisso("Ugo", 
						    12345, "via Dotto 1");

	ContrattoMobile utente2 = new ContrattoMobile("Ada", 6789123);

	// i due utenti fanno 10 telefonate di durata casuale (tra 1 e 100 sec)
	for (int i = 1; i <= 10; i++) {
	    int tempoCiacole = generatoreRandom.nextInt(100) + 1;
	    utente1.aggiornaBolletta(tempoCiacole);

	    tempoCiacole = generatoreRandom.nextInt(100) + 1;
	    utente2.aggiornaBolletta(tempoCiacole);
	}

	System.out.println("* * * * * * * * * * * * * * * * * * * * *");
	System.out.println("Bolletta del primo utente:");
	System.out.println(utente1.datiUtenza() + 
			   "\nnum. telefonate: " 
			   + utente1.dammiNumTelefonate()
			   + "\ncosto telefonate: " + utente1.dammiBolletta());
	System.out.println();
	System.out.println("Bolletta del secondo utente:");
	System.out.println(utente2.datiUtenza() + 
			   "\nnum. telefonate: " 
			   + utente2.dammiNumTelefonate()
			   + "\ncosto telefonate: " + utente2.dammiBolletta());
	System.out.println();
    }



}
