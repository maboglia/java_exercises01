import java.util.Scanner;

public class StampaFinoAltraSoluzione {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Inserisci una stringa e un carattere");
		String str = input.nextLine();
		char c = input.next().charAt(0);
		
		if (str.indexOf(c)!=-1)
			for (int i=0; i<str.indexOf(c); i++)
				System.out.print(str.charAt(i));
		else
			System.out.println(str);
	}

}
