import java.util.Scanner;

public class TerminaleSportello {

	// variabili d'istanza
	private int numSportello;  // numero dello sportello (1,2,3....)
	private Utente[] utenti;  // utenti abilitati ad usare questo sportello
	
	Scanner input; // input dichiarato come variabile di istanza per poterlo
	               // usare in tutti i metodi senza doverlo inizializzare in ognuno

	
	// variabili statiche
	private static int prossimoSportello=1; // contatore degli sportelli attivati
	
	// Conti correnti gestiti dalla banca, fino a un massimo di 100
	// All'inizio (quando non sono stati creati ancora conti correnti)
	// questo array contiene 100 "null" (oggetti non creati). Man mano che si
	// creano nuovi conti correnti i "null" vengono sostituiti dai rispettivi oggetti.
	// Ad esempio, dopo 10 creazioni di conti correnti, le posizioni da 0 a 9 di
	// questo array conterranno riferimenti ad oggetti ContoCorrente, mentre le
	// posizioni successive conterranno ancora "null".
	private static ContoCorrente[] contiGestiti = new ContoCorrente[100];
	
	// memorizza la posizione di contiGestiti in cui posizionare il prossimo
	// oggetto ContoCorrente creato (in altre parole, la posizione che contiene
	// il primo "null" dell'array)
	private static int prossimoConto=0; 

	// costruttore della classe. Riceve l'array degli utenti dal chiamante
	// e inizializza il numero di sportello automaticamente
	public TerminaleSportello(Utente[] ut) {
		numSportello=prossimoSportello;
		prossimoSportello++;
		input = new Scanner(System.in);
		utenti = ut;
	}

	// metodo che consente di accedere e usare il terminale
	public void login() {
		
		// chiede credenziali di accesso
		System.out.print("username: ");
		String username = input.nextLine();
		System.out.print("password: ");
		String password = input.nextLine();
		
		// verifica le credenziali inserite (cerca tra gli utenti)
		// invocando il metodo opportuno della classe Utente
		int i = 0; 
		boolean loginOK=false;
		while (i<utenti.length && !loginOK) {
			loginOK = utenti[i].controlla(username, password);
			if (!loginOK) i++;
		}
		
		// se le credenziali sono corrette, avvia il menu' con le operazioni
		if (loginOK) {
			// saluta l'utente
			System.out.println("Buongiorno, " + utenti[i].ottieniNome());
			avviaMenu();
			
		} else {
			System.out.println("Username o password errati!");
		}
			
	}
	
	// metodo ausiliaro che gestisce il menu delle operazioni
	private void avviaMenu() {

		char scelta;
		do {
			System.out.println(); //riga bianca
			System.out.println("SPORTELLO N. " + numSportello);
			System.out.println("OPERAZIONI DISPONIBILI");
			System.out.println("   [A]pri nuovo conto");
			System.out.println("   [S]aldo");
			System.out.println("   [V]ersamento");
			System.out.println("   [P]relievo");
			System.out.println("   [M]atura interessi (tutti i conti)");
			System.out.println("   [R]iepilogo conti");
			System.out.println("   [C]ambia tassi di interesse");
			System.out.println("   [U]scita");
			System.out.print("scelta: ");
			scelta = input.next().charAt(0);
			//input.nextLine(); //gestisce "a capo"

			System.out.println(); //riga bianca
			
			switch (scelta) {

			// caso "Apertura nuovo conto"
			case 'A':
				apriNuovoConto();
				break;

			// caso "Saldo"
			case 'S': 
				saldoConto();
				break;

			// caso "Versamento"
			case 'V': 
				versamentoInConto();
				break;

			// caso "Prelievo"
			case 'P':
				prelevaDaConto();
				break;
			
			// caso "Matura interessi"
			case 'M':
				maturaInteressi();
				break;
				
			// caso "Riepilogo conti"
			case 'R':
				riepilogoConti();
				break;

			// caso "Cambia tassi di interesse"
			case 'C':
				cambiaTassi();
				break;
			}

			System.out.println(); // riga vuota tra una operazione e l'altra

		} while (scelta!='U');

	}
	
	// metodo ausiliario che consente di aprire (creare) un nuovo conto
	private void apriNuovoConto() {
		char t;
		do {
			// legge F per il tipo "family", B per il tipo "business"
			System.out.print("Inserisci tipo cliente [F/B]: ");
			t = input.next().charAt(0);
			input.nextLine(); //gestisce "a capo"
		} while (t!='F' && t!='B');

		String tipo;
		if (t=='F') tipo="family";
		else tipo="business";

		// legge il saldo iniziale
		System.out.print("Inserisci saldo iniziale: ");
		double s = input.nextDouble();

		// se l'array contiGestiti non è pieno, crea un nuovo oggetto ContoCorrente
		if (prossimoConto<contiGestiti.length) {
			contiGestiti[prossimoConto] = new ContoCorrente(tipo,s);
			System.out.println("Creato conto numero " + contiGestiti[prossimoConto].ottieniNumero());
			prossimoConto++;
		} else
			System.out.println("ERRORE: limite conti gestibili esaurito!!!");


	}

	// metodo ausiliario che consente di ottenere il saldo di un conto
	private void saldoConto() {
		System.out.print("Inserisci il numero del conto: ");
		int num = input.nextInt();

		// richiama metodo ausiliario che fornisce l'indice del conto num nell'array contiGestiti
		int i = indiceConto(num);

		// se il conto esiste (i!=-1) stampa il saldo richiamando il metodo opportuno
		// della classe ContoCorrente
		if (i!=-1)
			System.out.println("Il saldo è " + contiGestiti[i].ottieniSaldo());
		else
			System.out.println("ERRORE: Conto " + num + " non trovato!");

	}

	// metodo ausiliario che consente di versare una somma in un conto conto
	private void versamentoInConto() {
		System.out.print("Inserisci il numero del conto: ");
		int num = input.nextInt();
	
		// richiama metodo ausiliario che fornisce l'indice del conto num nell'array contiGestiti
		int i = indiceConto(num);
	
		// se il conto esiste (i!=-1) chiede all'utente l'importo e lo versa
		// usando il metodo opportuno della classe ContoCorrente
		if (i!=-1) {
			System.out.print("Inserisci l'importo da versare: ");
			double somma = input.nextDouble();
	
			contiGestiti[i].versa(somma);
		}
		else
			System.out.println("ERRORE: Conto " + num + " non trovato");
	}
	
	// metodo ausiliario che consente di prelevare una somma da un conto conto
	private void prelevaDaConto() {
		System.out.print("Inserisci il numero del conto: ");
		int num = input.nextInt();

		// richiama metodo ausiliario che fornisce l'indice del conto num nell'array contiGestiti
		int i = indiceConto(num);
	
		// se il conto esiste (i!=-1) chiede all'utente l'importo e lo preleva
		// usando il metodo opportuno della classe ContoCorrente
		if (i!=-1) {
			System.out.print("Inserisci l'importo da prelevare: ");
			double somma = input.nextDouble();
	
			boolean prelievoOK = contiGestiti[i].preleva(somma);
			if (!prelievoOK) System.out.println("ERRORE: Impossibile prelevare " + somma + " euro");
		}
		else
			System.out.println("ERRORE: Conto " + num + " non trovato");
	}

	// metodo ausiliario che fa maturare gli interessi in tutti i conti gestiti
	private void maturaInteressi() {
		// per ogni oggetto in contiGestiti invoca il metodo
		// opportuno di ContoCorrente
		int i=0;
		while (i<contiGestiti.length && contiGestiti[i]!=null) {
			ContoCorrente cc = contiGestiti[i];
			cc.maturaInteressi();
			i++;
		}
	}

	// metodo ausiliario che stampa numero e saldo di tutti i conti gestiti
	private void riepilogoConti() {
		// per ogni oggetto in contiGestiti invoca i metodi
		// opportuni di ContoCorrente
		System.out.println("RIEPILOGO CONTI CORRENTI");
		int i=0;
		while (i<contiGestiti.length && contiGestiti[i]!=null) {
			ContoCorrente cc = contiGestiti[i];
			System.out.println("Conto n. " + cc.ottieniNumero() + " saldo: " + cc.ottieniSaldo());
			i++;
		}
	}

	// metodo ausiliario che consente di variare il tasso di interesse di una
	// categoria di clienti a scelta ("family" o "business")
	private void cambiaTassi() {

		// chiede all'utente di inserire la tipologia di cliente
		System.out.print("Inserisci tipo cliente di cui vuoi cambiare il tasso [F/B]: ");
		char tipo = input.next().charAt(0);
		input.nextLine(); //gestisce "a capo"
		
		if (tipo=='F' || tipo=='B') {
			System.out.println("Inserisci il nuovo tasso (es. 0,02): ");
			double tasso = input.nextDouble();
			
			// chiama il metodo opportuno sulla classe ContoCorrente
			// (non è necessario che esistano oggetti della classe)
			if (tipo=='F') ContoCorrente.modificaTassoFamily(tasso);
			else ContoCorrente.modificaTassoBusiness(tasso);
		} else {
			System.out.println("ERRORE: il tipo deve essere F o B");
		}
		
	}

	//metodo ausiliario che fornisce l'indice del conto num nell'array contiGestiti
	//restituisce -1 se non presente
	private static int indiceConto(int num) {
		int i=0; boolean trovato=false;
		while (i<prossimoConto && !trovato) {
			if (contiGestiti[i].ottieniNumero()==num) trovato=true;
			else i++;
		}

		if (trovato) return i;
		else return -1;

	}

}
