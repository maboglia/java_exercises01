/*
  Un contratto fisso e' un contratto telefonico con la sola aggiunta
  che in questo caso abbiamo anche l'indirizzo dell'utenza.
*/

public class ContrattoFisso extends ContrattoTelefonico {

    private String indirizzo; // indirizzo dell'utente.

    // costruisce un utente con i dati: nome dell'utente, numero di
    // telefono e indirizzo abitazione utente.
    public ContrattoFisso(String nome, int numero, String datiIndir) {
	super(nome, numero);  // chiama il costruttore della superclasse.
	indirizzo = datiIndir;
    }

    // ritorna i dati dell'utente (riscrive il metodo datiUtenza() della 
    // superclasse):
    public String datiUtenza() {
	return super.datiUtenza() + "\nindirizzo: " + indirizzo; 
    }
}
