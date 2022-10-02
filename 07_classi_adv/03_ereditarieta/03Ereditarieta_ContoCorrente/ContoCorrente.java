/**
Un conto corrente e' definito per un utente, si puo' depositare
del denaro del conto, prelevare il denaro, verificare il denaro
presente nel conto e controllare il nome dell'utente.
*/

public class ContoCorrente {

    private double saldo; // il saldo del conto
    private String nome; // il nome dell'utente

    /**
       Costruisce il conto di un utente di nome asseganto.
       @param nm nome dell'utente.
     */
    public ContoCorrente(String nm) {
	nome = nm;
    }

    /**
       Restituisce il nome dell'utente.
       @return nome dell'utente.
     */
    public String nomeUtente() {
	return nome;
    }

    /** 
	Deposita del denaro.
	@param denaro la somma depositata.
     */
    public void deposita(double denaro) {
	saldo += denaro;
    }

    /**
       Ritira denaro
       @param somma somma da ritirare.
    */
    public void ritira(double somma) {
	saldo -= somma;
    }

    /**
       Mostra il denaro depositato.
       @return denaro depositato.
    */
       public double mostraConto() {
	   return saldo;
       }


}  // fine classe ContoCorrente
