import java.util.Scanner;


public class SommaPositiviNegativi {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int num;
		int sommaP=0,sommaN=0;
		do {
			num = input.nextInt();
			if (num>0) sommaP+=num;
			else sommaN+=num;
		} while(num!=0);
		
		System.out.println("Positivi = " + sommaP);
		System.out.println("Negativi = " + sommaN);
	}

}
