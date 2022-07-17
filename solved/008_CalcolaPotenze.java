public class CalcolaPotenze {
    /*
      Dato un numero intero n, questo programma calcola un numero
      m tale che 2^m divide n e 2^(m+1) non divide n, cioe' calcola
      la massima potenza di 2 che divide n.
    */

    public static void main(String[] args) {

	int n = 2048;  // il numero da trattare

	int k = n;  // inizializzo k con il valore di n.

	int m = 0;  // inizializzo m

	while (k % 2 == 0) {
	    k /= 2;
	    m++;
	}
	System.out.println("La massima potenza di 2 che divide " + n +
			   " e': 2^" + m);

    }  // fine metodo main

} // fine classe CalcolaPotenze
