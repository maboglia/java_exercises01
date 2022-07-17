<<<<<<< HEAD:031_TuttiPositiviNegativi.java
import java.util.Scanner;

public class TuttiPositiviNegativi {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		boolean tuttipositivi = true;
		boolean tuttinegativi = true;
		
		System.out.println("Inserisci dieci numeri interi");
		
		for (int i=0; i<10; i++) {
			int n = input.nextInt();
			if (n>=0) tuttinegativi=false;
			else tuttipositivi=false;
		}
		
		if (tuttipositivi || tuttinegativi) 
			System.out.println("Valori tutti positivi o tutti negativi");
		else 
			System.out.println("Valori misti");

	}

}
=======
import java.util.Scanner;

public class TuttiPositiviNegativi {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		boolean tuttipositivi = true;
		boolean tuttinegativi = true;
		
		System.out.println("Inserisci dieci numeri interi");
		
		for (int i=0; i<10; i++) {
			int n = input.nextInt();
			if (n>=0) tuttinegativi=false;
			else tuttipositivi=false;
		}
		
		if (tuttipositivi || tuttinegativi) System.out.println("Valori tutti positivi o tutti negativi");
		else System.out.println("Valori misti");

	}

}
>>>>>>> 617a8cce344ffaa6bfacec866c72d53c93b5d86a:TuttiPositiviNegativi.java
