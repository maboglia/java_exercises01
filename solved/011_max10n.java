/*****************************************************************
 *                        Max fra 10 numeri                      *
 *****************************************************************/

import java.util.Scanner;

class max10n
{

	public static void main (String args[])
		{
		int A, B, max, contatore;
		Scanner s = new Scanner(System.in);

		System.out.println("                  MAX FRA 10 NUEMRI");
		System.out.println("");

		System.out.print("Introduci un numero: ");
    		A = s.nextInt();
    		max = A;

		for (contatore=1; contatore<=10; contatore++)
			{
			System.out.print("Introduci un numero: ");
			B = s.nextInt();
    		if (B > max)    max = B;

			}


		/* OUTPUT */

		System.out.println("");
		System.out.println("Il MAX e' "+max);
		}

}