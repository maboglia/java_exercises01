/*****************************************************************
 *                       Divisione con resto                     *
 *****************************************************************/
	import java.util.Scanner;

class divisioneConResto
{

	public static void main (String [] args)
		{
		int dividendo, divisore, quoziente, resto, contatore;
		Scanner s = new Scanner(System.in);

		System.out.println("DIVISIONE CON RESTO");
		System.out.println("");

		System.out.print("Introduci il dividendo: ");
		dividendo = s.nextInt();
		System.out.print("Introduci il divisore: ");
		divisore = s.nextInt();

		contatore = 0;
		quoziente = dividendo;

		while (dividendo >= divisore)
 			{
			quoziente = dividendo - divisore;
			dividendo = quoziente;
			contatore++;
			}

		resto = quoziente;
		quoziente = contatore;

		System.out.println("Quoziente = " +quoziente);
		System.out.println("Resto = " +resto);
		}
}