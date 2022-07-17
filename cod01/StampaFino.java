import java.util.Scanner;

public class StampaFino {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Inserisci una stringa e un carattere");
		String str = input.nextLine();
		char c = input.next().charAt(0);
		
		if (str.indexOf(c)!=-1)
			System.out.println(str.substring(0, str.indexOf(c)));
		else
			System.out.println(str);
	}

}
