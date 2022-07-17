/*
Questo programma calcola le potenze di un numero intero usando 
interi di tipo long.
*/

public class TestNumeriLong {


    public static void main(String[] args) {

	int numeroBase;
	numeroBase = 1234;

	String spazio = "    ";  // definisco uno spazio per l'impaginazione

	long quadrato, cubo, quartaPot, quintaPot, sestaPot;
	double sestaPotDouble;

	quadrato = numeroBase*numeroBase;
	cubo = quadrato*numeroBase;
	quartaPot = cubo*numeroBase;
	quintaPot = quartaPot*numeroBase;
	sestaPot = quintaPot*numeroBase;

	sestaPotDouble = Math.pow(numeroBase, 6);

	System.out.println();
	System.out.println(spazio + "numero base:    " + numeroBase);
	System.out.println(spazio + "quadrato:       " + quadrato);
	System.out.println(spazio + "cubo:           " + cubo);
	System.out.println(spazio + "quarta potenza: " + quartaPot);
	System.out.println(spazio + "quinta potenza: " + quintaPot);
	System.out.println(spazio + "sesta potenza:  " + sestaPot);

	System.out.println();

	System.out.println("Altro modo per calcolare la sesta potenza: " 
			   + "usando Math.pow(): \n" + 
			   + sestaPotDouble);
	System.out.println();




    }  // fine main


} // fine class TestNumeri2
