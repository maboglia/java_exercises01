/* 
   Classe per simulare il comportamento di un orologio.
   La classe contiene un costruttore con tre argomenti (ore, min, sec)
   e un metodo public che incrementa i secondi di una unita' e un 
   metodo che stampa l'ora. 
*/

public class Orologio {

    private int ore, minuti, secondi;
    private int accumuloMin, accumuloOre;

    public Orologio(int h, int m, int s) {
	accumuloMin = 0; 
	accumuloOre = 0;
	aggiornaSecondi(s);
	aggiornaMinuti(m);
	aggiornaOre(h);
    }

    public void incrementaSecondi() {
	secondi++;
	if (secondi == 60) {
	    secondi = 0; 
	    minuti++;
	    if (minuti == 60) {
		minuti = 0; 
		ore++;
		if (ore == 24) 
		    ore = 0;
	    }
	}
    }

    public String dammiOra() {
	return "Ore: " + ore + "; minuti: " 
	    + minuti + "; secondi: " + secondi;
    }

    private void aggiornaSecondi(int sec) {
	if (sec >= 0) {
	    secondi = sec % 60;
	    accumuloMin = sec / 60;
	}
	else {
	    int a = sec / 60;   // a e' un numero negativo.
	    secondi = sec - (a - 1) * 60;
	    accumuloMin = (a - 1); 
	}
    }

    private void aggiornaMinuti(int min) {
	minuti = min + accumuloMin;
	if (minuti >= 0) {
	    accumuloOre = minuti / 60;
	    minuti = minuti % 60;
	}
	else {
	    int a = minuti / 60;
	    minuti = minuti - (a - 1) * 60;
	    accumuloOre = (a - 1);
	}
    }

    private void aggiornaOre(int hr) {
	ore = (hr + accumuloOre);
	if (ore >= 0) 
	    ore = ore % 24;
	else {
	    int a = ore / 24;
	    ore = ore - (a - 1) * 24;
	}

    }

    // testo la classe:

    public static void main(String[] a) {
	Orologio mioOrologio = new Orologio(23, 59, 50);
	System.out.println(mioOrologio.dammiOra()); 
	for (int i = 0; i < 20; i++) {
	    mioOrologio.incrementaSecondi();
	    System.out.println(mioOrologio.dammiOra());
	}
	System.out.println("* * * * * * * * * * * * *");
	mioOrologio = new Orologio(1, 2, -130);
	System.out.println(mioOrologio.dammiOra()); 

    }
}
