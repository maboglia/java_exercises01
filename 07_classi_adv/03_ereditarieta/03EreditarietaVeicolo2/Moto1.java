/*
  La classe Moto1 eredita dalla classe Veicolo1 e aggiunge una caratteristica
  in piu', ossia il numero di posti (che puo' essere 1 o 2).
*/


public class Moto1 extends Veicolo1 {

    private int numPosti;

    public Moto1(int numMatr, String nomePr, int numPt) {
	super(numMatr, nomePr); 
	numPosti = numPt;
    }

    public void assegnaNumPosti(int numPt) {
	numPosti = numPt;
    }

    public int dammiNumPosti() {
	return numPosti;
    }

    // riscrivo il metodo disegna() della superclasse:
    public String disegna() {
	if (numPosti == 1) 
	    return "disegno di una motocicletta ad un posto";
	else
	    return "disegno di una motocicletta a due posti";
    }

}
