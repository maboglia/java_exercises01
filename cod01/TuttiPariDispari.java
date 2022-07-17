import java.util.Scanner;

public class TuttiPariDispari {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		boolean tuttipari = true;
		boolean tuttidispari = true;

		System.out.println("Inserisci dieci numeri interi");
		
		for (int i=0; i<10; i++) {
			int n = input.nextInt();
			if ((n%2)==0) tuttidispari=false; 
			else tuttipari=false;
		}

		if (tuttipari || tuttidispari) System.out.println("Valori tutti pari o tutti dispari");
		else System.out.println("Valori misti");
	}

}
