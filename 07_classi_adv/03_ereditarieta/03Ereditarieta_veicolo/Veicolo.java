/*
La classe veicolo, che definisce un veicolo con le seguenti 
caratteristiche: 
- numero Matricola;
- nome proprietario.
Si puo' cambiare il nome del proprietario, e vedere il numero
matricola o il proprietario.
*/

public class Veicolo {

    private int numMatricola;
    private String proprietario;

    public Veicolo() {
	numMatricola = -1;
	proprietario = "NN";
    }

    public void assegnaProprietario(String nome) {

	proprietario = nome;
    }

    public String dammiProprietario() {
	return proprietario;
    }

    public void assegnaMatricola(int matricola) {
	numMatricola = matricola;
    }

    public int dammiMatricola() {
	return numMatricola;
    }

}  // fine classe Veicolo
