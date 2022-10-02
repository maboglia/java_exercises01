/*
  La classe Moto eredita dalla classe Veicolo e aggiunge una caratteristica
  in piu', ossia il numero di posti (che puo' essere 1 o 2).
*/


public class Moto extends Veicolo {

    private int numPosti;

    public void assegnaNumPosti(int numPt) {
	numPosti = numPt;
    }

    public int dammiNumPosti() {
	return numPosti;
    }
}
