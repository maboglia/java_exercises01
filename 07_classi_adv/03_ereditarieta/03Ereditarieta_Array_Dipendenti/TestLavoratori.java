/* Testa le classi Lavoratore, Capo, Impiegato, Fattorino.
   Si definisce un array di 10 lavoratori (che comprendono
   un Capo, alcuni impiegati e alcuni fattorini. Si calcola
   poi lo stipendio per ogni lavoratore usando il polimorfismo.
*/

public class TestLavoratori {

    public static void main(String[] s) {

	// definizione e inizializzazione dell'array "personale":
	Lavoratore[] personale = new Lavoratore[10];
	personale[0] = new Capo("Antonio", "Fortunato");
	String[] nomi = new String[] {"Anna","Mary","Carla","Sergio"};
	String[] cognomi = new String[] {"Sossi", "Rossi", "Bossi", "Massi"};
	for (int i= 0; i < 4; i++) 
	    personale[i+1] = new Impiegato(nomi[i], cognomi[i]);

	String[] altriNomi = new String[] {"Ada","Ugo","Gino","Andy", "Lino"};
	String[] altriCognomi = new String[] {"Bianchi", "Falco", "Oio", 
					      "Red", "Alberti"};
	for (int i= 5; i <= 9; i++) 
	    personale[i] = new Fattorino(altriNomi[i-5], altriCognomi[i-5]);


	// scelgo un numero di giorni lavorativi (tra 1 e 31) e 
	// calcolo lo stipendio dei lavoratori:

	int numGiorni = (int)(1+Math.random()*31);

	System.out.println("Giorni lavorativi: " + numGiorni);


	// Il seguente ciclo for mostra un esempio di polimorfismo:
	// si noti che l'istruizione personale[j].stipendio(...)
	// si comporta in tre modi differenti, a seconda de il
	// j-imo lavoratore e' un capo, un impiegato o un 
	// fattorino. 

	for (int j = 0; j < personale.length; j++) {
	    System.out.println("Stipendio di " + personale[j].getNome()
			       + "  " + personale[j].getCognome() + ": " +
			       personale[j].stipendio(numGiorni));
	}

    }

}
