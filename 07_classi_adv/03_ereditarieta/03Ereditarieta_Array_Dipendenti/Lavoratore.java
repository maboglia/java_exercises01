/* La classe Lavoratore definisce le caratteristiche di 
   un lavoratore. Viene usata per costruire sottoclassi
   di lavoratori con caratteristiche piu' specifiche.
*/

public class Lavoratore {

    // nome, cognome del lavoratore:
    private String nome, cognome;
    // stipendio base giornaliero (costante per tutti):
    public static final double STIPENDIO_GIORNALIERO = 25;

    // Costruttore:
    public Lavoratore(String nome, String cognome) {
	this.nome = nome; 
	this.cognome = cognome;
    }

    // restituisce il nome di un lavoratore:
    public String getNome() {
	return nome;
    }
    // restituisce il cognome di un lavoratore:
    public String getCognome() {
	return cognome;
    }

    // restituisce lo stipendio base:
    public double stipendio(int giorni) {
	return giorni*STIPENDIO_GIORNALIERO;
    }

}
