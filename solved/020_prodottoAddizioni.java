/*****************************************************************
 *         Prodotto di due numeri con la sola addizione    *
 *****************************************************************/

	import java.util.Scanner;

class prodottoAddizioni
{

	public static void main (String args[])
		{

		int numero1, numero2, contatore, prodotto;
		Scanner s = new Scanner(System.in);

	/* INPUT */

		System.out.println("                                     PRODOTTO");
		System.out.println("");

		System.out.print("Introduci il primo fattore: ");
    		numero1 = s.nextInt();
 	   	System.out.println("");

		System.out.print("Introduci il secondo fattore: ");
 	   	numero2 = s.nextInt();


	/* ELABORAZIONE */

		contatore = 0;
		prodotto = 0;

		while (contatore < numero2)
				{
				prodotto = prodotto + numero1;
				contatore++;
				}


	/* OUTPUT */

		System.out.println("");
		System.out.println("Il prodotto e' "+prodotto);

	}

}