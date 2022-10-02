/*
  La classe Camion1 eredita dalla classe Veicolo1 e aggiunge una caratteristica
  in piu', ossia il numero di assi (che puo' essere 2 o 3 o ...).
*/

public class Camion1 extends Veicolo1 {

    private int numAssi;

    public Camion1(int numMatr, String nomePr, int num) {
	super(numMatr, nomePr);
	numAssi = num;
    }

    public void assegnaAssi(int num) {
	numAssi = num;
    }

    public int dammiAssi() {
	return numAssi;
    }

    // riscrivo il metodo disegna() della superclasse:
    public String disegna() {
	return "disegno di un camion";
    }

}
