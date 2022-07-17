/*****************************************************************
 *             Scambia il contenuto di due variabili             *
 *****************************************************************/

import java.util.Scanner;

class Scambia
{

	public static void main (String args[])
		{

		int A, B, temporaneo;


	/* INPUT */

		System.out.println("SCAMBIA DUE NUMERI");
		System.out.println("");

		Scanner s = new Scanner(System.in);
		System.out.print("Introduci A: ");
    		A = s.nextInt();
    		System.out.println("");

		System.out.print("Introduci B: ");
    		B = s.nextInt();


	/* ELABORAZIONE */

		temporaneo = A; 			// scambia i numeri
		A    = B;
		B    = temporaneo;


	/* OUTPUT */

		System.out.println("");
		System.out.println("A = "+A);
		System.out.println("B = "+B);

	}

}