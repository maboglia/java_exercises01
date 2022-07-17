import java.util.Scanner;

class McdDivisioni
{

	public static void main (String args[])
		{
		Scanner s = new Scanner(System.in);

		int numero1, numero2, temporaneo;
		int mcd = 1;
		boolean trovato = false;


	/* INPUT */
	
		System.out.println("                                     M.C.D.");
		System.out.println("");

		System.out.print("Introduci il primo numero: ");
    		numero1 = s.nextInt();
		System.out.println("");

		System.out.print("Introduci il secondo numero: ");
    		numero2 = s.nextInt();


	/* ELABORAZIONE */

		while (numero1 != 0)
			{
			if (numero1 < numero2)
				{
				temporaneo = numero1; 		// scambia i numeri
				numero1    = numero2;
				numero2    = temporaneo;
				}
			numero1 = numero1 % numero2;		// resto della divisione fra numero1 e numero2
			}
		mcd = numero2;


	/* OUTPUT */

		System.out.println("");
		System.out.println("Il M.C.D. = "+mcd);

	}
}