/*
  Un oggetto di questa classe e' un contratto telefonico che ha un numero, 
  un nome dell'abbonato e una bolletta, data da una costante (COSTO_AL_SECONDO)
  moltiplicata per il numero di secondi di una telafonata.
*/

public class ContrattoTelefonico {

    private int numeroTel;
    private String utente;
    private double costoTelefonate;
    private int numTelefonate;

    private static final double COSTO_AL_SECONDO = 0.05;

    // costruisce un contratto telefonico assegnando un numero di tel
    // e un nome all'utente:
    public ContrattoTelefonico(String nomeUt, int numero) {

	utente = nomeUt;
	numeroTel = numero; 
	// al momento del contratto, l'utente non ha fatto telefonate e
	// non ha costi di telefonate.
	costoTelefonate = 0;
	numTelefonate = 0;

    }

    // metodo per ottenere i dati dell'utente:
    public String datiUtenza() {
	return "Utente: " + utente + "; numero tel.: " + numeroTel;
    }


    // aggiorna la spesa telefonica per una telefonata di un assegnato
    // numero di secondi.
    public void aggiornaBolletta(int numSecondi) {
	costoTelefonate += COSTO_AL_SECONDO * numSecondi;
	numTelefonate++;
    }

    public void aggiungiCosti(double costo) {
	costoTelefonate += costo;
    }

    // restituisce la bolletta telefonica:
    public double dammiBolletta() {
	return costoTelefonate;
    }

    // restituisce il numero delle telefonate effettuate:
    public int dammiNumTelefonate() {
	return numTelefonate;
    }
}
