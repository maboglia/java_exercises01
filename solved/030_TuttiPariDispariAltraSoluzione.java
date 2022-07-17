import java.util.Scanner;

public class TuttiPariDispariAltraSoluzione {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Inserisci dieci numeri interi");
		int primo = input.nextInt();
		boolean diverso = false;
		
		for (int i=0; i<9; i++) {
			int n = input.nextInt();
			if ((n%2)!=(primo%2))
				diverso = true;
		}

		if (!diverso) System.out.println("Valori tutti pari o tutti dispari");
		else System.out.println("Valori misti");
	}

}
