public class CercaNumero {

    /* 
       Questo programma definisce un numero a caso tra 1 e 10000 finche' 
       tale numero non risulta il numero 5. Dopo di che stampa il numero
       di tentativi che sono stati necessari per trovarlo.
    */

    public static void main(String[] a) {

	int maxNum = 10000; // il massimo valore del numero casuale.

	int numeroCasuale;
	int bersaglio = 5;
	int tentativi = 0;  // conta i tentativi fatti nella ricerca.
	while (true) {
	    numeroCasuale = (int)(Math.random() * maxNum + 1);
	    tentativi++;
	    if (numeroCasuale == bersaglio)
		break;
	}

	System.out.println("Per trovare il numero " + bersaglio + 
			   " sono stati fatti " + tentativi + " tentativi");


    } // fine metodo main

} // fine classe CercaNumero
