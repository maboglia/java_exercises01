import java.util.Scanner;

public class GestioneRegistroEta {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Inserisci il nome del file di registro:");
		String nomefile = input.nextLine();
		System.out.println();
		
		// crea un registro usando il file indicato dall'utente
		RegistroEtaCompleto registro = new RegistroEtaCompleto(nomefile);
		
		// menu
		char scelta;
		do {
			System.out.println();
			System.out.println("[V]isualizza registro");
			System.out.println("[A]ggiungi elemento");
			System.out.println("[I]ncrementa eta'");
			System.out.println("[S]alva dati");
			System.out.println("[E]sci");
			
			System.out.println();
			System.out.print("Inserisci la tua scelta: ");
			scelta = input.next().charAt(0);
			input.nextLine();
			
			switch (scelta) {
			case 'V' : // visualizza il contenuto del registro 
				registro.visualizza(); 
				break;
			case 'A' : // aggiunge un elemento al registro
				System.out.println("Inserisci nome:");
				String nome = input.nextLine();
				System.out.println("Inserisci eta':");
				int eta = input.nextInt();
				registro.inserisciNuovo(nome, eta);
				break;
			case 'I' : // incrementa l'eta di una persona
				System.out.println("Inserisci nome:");
				String n = input.nextLine();
				int ris = registro.incrementaEta(n);
				if (ris==-1)
					System.out.println("Nominativo non trovato");
				else
					System.out.println("La nuova eta e' " + ris);
				break;
			case 'S' : // salva il registro
				boolean tuttoOk = registro.salva();
				if (tuttoOk)
					System.out.println("Dati Salvati");
				else
					System.out.println("Problema durante il salvataggio");
				break;
			case 'E' : // esce dal programma
				if (registro.daSalvare()) {
					char risposta;
					do {
						System.out.println("Vuoi salvare le modifiche effettuate (S/N)?");
						risposta = input.next().charAt(0);
						input.nextLine();
						if (risposta=='S') registro.salva();
					} while (risposta!='S' && risposta!='N');
				}
			}
		} while (scelta!='E');
		
		

	}

}
