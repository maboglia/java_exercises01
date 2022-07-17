import java.util.Scanner;

public class TuttiPositiviNegativiAltraSoluzione {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Inserisci dieci numeri interi");
		int primo = input.nextInt();
		boolean diverso = false;
		
		for (int i=0; i<9; i++) {
			int n = input.nextInt();
			if (((primo>=0) && (n<0)) || ((primo<0) && (n>=0)))
				diverso = true;
		}
		
		if (!diverso) System.out.println("Valori tutti positivi o tutti negativi");
		else System.out.println("Valori misti");

	}

}
