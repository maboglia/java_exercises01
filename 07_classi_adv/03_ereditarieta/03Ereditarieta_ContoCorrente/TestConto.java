/* Un esempio di utilizzo della classe Conto Corrente. Si definiscono 
   due utenti che possono fare tre operazioni sul loro conto: depositare
   denaro, prelevare denaro, vedere l'estratto conto. 
   Il programma potrebbe essere molto migliorato se si sapessero usare
   gli array (in questo modo si potrebbe evitare l'utilizzo della 
   variabile numeroUtente).
*/

import java.io.*;

public class TestConto {

    private static String nomeUtente;  // nome del correntista 
                                       // che utilizza la banca
    private static int numeroUtente;  // 1 per il primo ut, 2 per il II.

    private static ContoCorrente utente1, utente2;  // i due correntisti

    public static void main(String[] a) {

	// definisco due correntisti:
	utente1 = new ContoCorrente("Fabio");
	utente2 = new ContoCorrente("Giulia");

	// Stampo il messaggio di presentazione:
	System.out.println("\n\n   ****************************************");
	System.out.println("\nBenvenuti nella BdO, la Banca dell'Onesta'");
	System.out.println("Immettere il proprio nome: ");	    

	// leggo il nome dato dall'utente finche' non e' un nome giusto.
	do {
	    leggiNome();
	    // stabilisco chi e' l'utente che si e' collegato:
	    if (nomeUtente.equals(utente1.nomeUtente())) {
		numeroUtente = 1;
	    }
	    else if (nomeUtente.equals(utente2.nomeUtente())) {
		numeroUtente = 2;
	    }
	    else
		numeroUtente = 0;  // il nome non corrisponde!
	    if (numeroUtente == 0)
		System.out.println("Nome non corretto. " +
				   "Ripetere immissione nome:");
	}
	while (numeroUtente == 0);
	System.out.println();

	// messaggio di benvenuto all'utente
	System.out.println("Caro/a " + nomeUtente + ", benvenuto/a nella BdO");
	System.out.println();

	// richiedo le operazioni da fare finche' richieste dall'utente
	// o finche' sono richieste errate.
	do {
	    System.out.println("\nQuali operazioni vuoi fare?");
	    System.out.println("Deposito (1), prelievo (2), " +
			       "estratto conto (3) ? \n(0 per uscire)\n");

	    String risp = leggiStringaInput();
	    
	    if (risp.equals("1")) 
		depositaSoldi(numeroUtente);
	    else if (risp.equals("2"))
		ritiraSoldi(numeroUtente);
	    else if (risp.equals("3"))
		stampaEstrattoConto(numeroUtente);
	    else if (risp.equals("0")) {
		System.out.println("\nGrazie per aver utilizzato la BdO, " 
				   + " la Banca dell'Onesta'. \nRicorda, la "
				   + "Banca dell'Onesta' e' sempre al tuo "
				   + "servizio! \nCiao, povero/a illuso/a!\n");
		break;
	    }
	    else
		System.out.println("\nDati errati. Ripetere!");
	}
	while (true);

    }

    // legge il nome dell'utente dai dati immessi
    private static void leggiNome() {
	nomeUtente = leggiStringaInput();
    }

    private static void depositaSoldi(int numUt) {

	System.out.println("\nQuanti soldi vuoi depositare? ");

	// leggo i dati immessi sotto forma di stringa e li converto 
	// in intero. Non e' inserito alcun controllo sulla correttezza
	// dei dati
	String soldi = leggiStringaInput();
	int somma = Integer.parseInt(soldi);
	if (numUt == 1) 
	    utente1.deposita(somma);
	else if (numUt == 2) 
	    utente2.deposita(somma);
	else
	    return;  // che altro fare in questo caso?
    }
    
    private static void ritiraSoldi(int numUt) {
	System.out.println("\nQuanti soldi vuoi prelevare? ");

	// leggo i dati immessi sotto forma di stringa e li converto
	// in intero. Non e' inserito alcun controllo sulla correttezza
	// dei dati
	String soldi = leggiStringaInput();
	int somma = Integer.parseInt(soldi);
	if (numUt == 1) 
	    utente1.ritira(somma);
	else if (numUt == 2) 
	    utente2.ritira(somma);
	else 
	    return; // qui non dovrei comunque mai arrivare
    }

    private static void stampaEstrattoConto(int numUt) {
	System.out.println("\nSomma rimasta sul conto:");
	if (numUt == 1)
	    System.out.println(utente1.mostraConto());
	else if (numUt == 2) 
	    System.out.println(utente2.mostraConto());
	else
	    return;  // qui non dovrei mai arrivare
    }

    // metodo che legge i dati in input e restituisce sotto forma 
    // di stringa
    private static String leggiStringaInput() {
	String risposta = "";
	BufferedReader rispConsole = 
	    new BufferedReader(
			       new InputStreamReader(System.in));
	try {
	    risposta = rispConsole.readLine(); 
	}
	catch (IOException e) {
	    System.out.println("Errore di input");
	    System.exit(1);
	}
	return risposta;
    }


}// fine classe TestConto
