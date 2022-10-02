import java.text.NumberFormat;

public class Conto {

    private String nome, cognome;  // nome e cognome utente.
    private double saldo;  // denaro depositato sul conto.

    private static int numeroUtente = 0; // variabile che tiene 
                                         // traccia del numero di
                                         // utenti via via costruiti.

    private String codiceConto = "bdo300";  // il codice corrispondente
                                            // a ciascun correntista.

    private int numOperazioni;  // numero operazioni eseguite sul conto.

    private final static int limiteOperazioni = 6; // ogni 6 operazioni
                                                    // la banca mette un costo

    private final static double costoOperazioni = 3.75; // costo di 6 operaz.

    private StringBuffer registro; // il registro delle operazioni.

    private NumberFormat formattatore; // per la stampa ordinata dei numeri
                                       // di tipo double.
    /* 
       Costruttore: per definire un oggetto di tipo "Conto" bisogna
       indicare un nome, un cognome e una somma inizialmente depositata 
       sul conto.
    */
    public Conto(String nm, String cgn, double somma) {
	nome = nm;
	cognome = cgn; 
	saldo = somma - 3*somma/100; // la banca trattiene subito il
	                             // 3% della somma depositata per
	                             // le sue spese. 

	numeroUtente++; // ogni volta che viene costruito un nuovo oggetto, 
	                // la variabile viene incrementata di 1.

	codiceConto = codiceConto + numeroUtente;  // codice conto e' una 
	                                           // stringa che contiene
	                                           // negli ultimi caratteri
	                                           // un numero progressivo, 
	                                           // diverso per ogni utente.

	numOperazioni = 0;  // all'inizio l'utente non ha fatto operazioni.

	// sul registro delle operazioni inseriamo i dati dell'utente 
	// e il suo numero di conto:
	registro = new StringBuffer("Utente: " + nome + " " + cognome +
				    " numero conto: " + codiceConto);
	
	// Quanto segue serve per ottenere una buona formattazione 
	// dei numeri double.
	formattatore = NumberFormat.getNumberInstance();
	formattatore.setMaximumFractionDigits(2);
	formattatore.setMinimumFractionDigits(2);

    }

    /*
      Metodo per depositare una somma sul conto. Fa incrementare il 
      numero delle operazioni effettuate. Se il numero raggiunge il 
      valore di "limiteOperazioni", viene addebitato un costo.
    */

    public void deposita(double somma) {
	numOperazioni++;
	if (numOperazioni < limiteOperazioni) {
	    saldo += somma;
	    registro.append("\ndepositata una somma di: " 
			    + formattatore.format(somma) + " euro");
	}
	else {
	    saldo = saldo + somma - costoOperazioni;
	    registro.append("\ndepositata una somma di: " 
			    + formattatore.format(somma) + " euro");
	    registro.append("\n addebitato un consto di: " + costoOperazioni
			    + " euro");
	    numOperazioni = 0;
	}
    }

    /*
      Metodo per ritirare una somma dal conto. Fa incrementare il 
      numero delle operazioni effettuate. Se il numero raggiunge il 
      valore di "limiteOperazioni", viene addebitato un costo.
    */

    public void ritira(double somma) {
	numOperazioni++;
	if (numOperazioni < limiteOperazioni) {
	    saldo -= somma;
	    registro.append("\nritirata una somma di: " 
			    + formattatore.format(somma) + " euro");
	}
	else {
	    saldo = saldo - somma - costoOperazioni;
	    registro.append("\nritirata una somma di: " 
			    + formattatore.format(somma) + " euro");
	    registro.append("\n addebitato un consto di: " + costoOperazioni
			    + " euro");
	    numOperazioni = 0;
	}
    }

    // restituisce il registro delle operazioni.
    public StringBuffer registroOperazioni() {
	registro.append("\nSaldo attuale: " + 
			formattatore.format(saldo) + " euro");
	return registro;
    }

}
