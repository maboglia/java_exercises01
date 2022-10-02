/*
  La classe Camion eredita dalla classe Veicolo e aggiunge una caratteristica
  in piu', ossia il numero di assi (che puo' essere 2 o 3 o ...).
*/

public class Camion extends Veicolo {

    private int numAssi;

    public void assegnaAssi(int num) {
	numAssi = num;
    }

    public int dammiAssi() {
	return numAssi;
    }
}
