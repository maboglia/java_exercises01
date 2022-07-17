/*****************************************************************
 *                        Max fra 100 numeri                     *
 *****************************************************************/

import java.util.Scanner;

class valoreAssoluto
{

	public static void main (String args[])
		{
		int A;
		Scanner s = new Scanner(System.in);

		System.out.println("VALORE ASSOLUTO");
		System.out.println("");

		System.out.print("Introduci A: ");
    		A = s.nextInt();

		if (A < 0)	
			A = -A;

		System.out.println("");
		System.out.println("|A| = "+A);

	}

}