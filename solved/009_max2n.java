<<<<<<< HEAD
/*Trova il valore max tra 2 numeri interi*/ 
import java.util.Scanner;
=======
/*trova il valore massimo tra due numeri */
>>>>>>> 617a8cce344ffaa6bfacec866c72d53c93b5d86a

import java.util.Scanner;

class Max2n
{

	public static void main (String args[])
		{
		int numero1, numero2, max;
		Scanner s = new Scanner(System.in);

	/* INPUT */

	System.out.println("     MAX fra due numeri");
	System.out.println("");

	System.out.print("Introduci il primo numero: ");
    numero1 = s.nextInt();
    System.out.println("");

	System.out.print("Introduci il secondo numero: ");
    numero2 = s.nextInt();


	/* ELABORAZIONE */
	if (numero1 == numero2)
		{
		System.out.println("");
		System.out.println("I due numeri sono uguali");
		}
	else
		{
		if (numero1<numero2)
				max=numero2;
		else
				max=numero1;
		System.out.println("");
		System.out.println("Il MAX e' "+max);
		}




	}

}