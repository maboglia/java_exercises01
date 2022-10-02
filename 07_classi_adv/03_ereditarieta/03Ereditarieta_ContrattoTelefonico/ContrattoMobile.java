/*
  Un contratto per un telefono mobile e' un contratto telefonico ove 
  il conteggio della bolletta viene fatto con lo stesso criterio 
  generale, salvo che ad ogni risposta viene aggiunto un sovrapprezzo
  COSTO_RISPOSTA.
*/

public class ContrattoMobile extends ContrattoTelefonico {

    private static final double COSTO_RISPOSTA = 5.10; // costo alla risposta.

    // costruisce un contratto con un telefono mobile assegnando
    // un nome e un numero di telefono all'utente.
    public ContrattoMobile(String nome, int numero) {
	super(nome, numero);
    }

    // riscrive il metodo aggiornaBolletta() della superclasse 
    // modificandola in accordo con le tariffe addottate per il 
    // telefono mobile.
    public void aggiornaBolletta(int nSecondi) {
	super.aggiornaBolletta(nSecondi);
	super.aggiungiCosti(COSTO_RISPOSTA);
    }

}
