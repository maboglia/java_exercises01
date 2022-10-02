import java.util.Scanner;

public class GestioneBanca {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		// crea tre utenti (impigati bancari) impostando username e password
		Utente[] utenti = new Utente[3];
		utenti[0] = new Utente("Paolo Milazzo", "milazzo", "31011979");
		utenti[1] = new Utente("Mario Rossi", "rossi", "01011980");
		utenti[2] = new Utente("Gino Bianchi", "bianchi", "123456");
		
		// crea due terminali di sportello
		TerminaleSportello[] terminali = new TerminaleSportello[2];
		terminali[0] = new TerminaleSportello(utenti);  //terminale 1
		terminali[1] = new TerminaleSportello(utenti);  //terminale 2
		
		// fa scegliere iterativamente all'utente (impegato) quale terminale usare
		int scelta;
		do {
			System.out.println("Inserisci numero terminale (1/2) oppure 0 per uscire");
			scelta=input.nextInt();
			// se l'utente sceglie 1 o 2 consente di fare login invocando il metodo
			// opportuno di TerminaleSportello
			if (scelta<0 || scelta>2) System.out.println("Scelta errata");
			else if (scelta!=0) terminali[scelta-1].login();
		} while (scelta!=0);
	}

}
