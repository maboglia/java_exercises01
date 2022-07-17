import java.util.Scanner;


public class SommaPariDispari {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int num;
		int sommaP=0,sommaD=0;
		do {
			num = input.nextInt();
			if (num%2==0) sommaP+=num;
			else sommaD+=num;
		} while(num!=0);
		
		System.out.println("Positivi = " + sommaP);
		System.out.println("Negativi = " + sommaD);
	}

}
