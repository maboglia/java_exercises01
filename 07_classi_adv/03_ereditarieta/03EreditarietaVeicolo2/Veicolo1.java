/*
  La classe Veicolo1, che definisce un veicolo con le seguenti 
  caratteristiche: 
  - numero Matricola;
  - nome proprietario.
  Si puo' cambiare il nome del proprietario, e vedere il numero
  matricola o il proprietario.
  Rispetto alla classe Veicolo.java, questa classe possiede un 
  nuovo costruttore (ove si definisce il num matricola e il nome
  del proprietario) e un metodo per il disegno (che verra' 
  soprascritto nelle sue sottoclassi).

*/

public class Veicolo1 {

    private int numMatricola;
    private String proprietario;

    public Veicolo1(int nMatr, String nomePr) {
	numMatricola = nMatr;
	proprietario = nomePr;
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

    // metodo per il disegno di un veicolo (schematizzato)
    public String disegna() {
	return "Ecco il disegno di un veicolo";
    }

}  // fine classe Veicolo1
