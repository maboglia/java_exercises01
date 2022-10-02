import java.io.*;
import java.util.Vector;

public class RegistroEtaCompleto {
	
	// nome del file in cui è salvato il registro
	private String nomefile;
	
	// vettore che gestisce i dati letti dal registro
	private Vector<NomeEta> dati = new Vector<NomeEta>();
	
	// flag per tenere traccia di modifiche non salvate su file
	private boolean modificato=false;
	
	// costruttore: riceve il nome del file di registro come parametro
	public RegistroEtaCompleto(String nomefile) {
		this.nomefile = nomefile;
		try {
			ObjectInputStream file_input = new ObjectInputStream(new BufferedInputStream(new FileInputStream(nomefile)));
			// legge l'intero vettore da file
			dati = (Vector<NomeEta>) file_input.readObject();
			file_input.close();
		} catch (FileNotFoundException e) {
			// gestisce il caso in cui il file non sia presente (sarà creato poi...)
			System.out.println("ATTENZIONE: Il file " + nomefile + " non esiste");
			System.out.println("Sara' creato al primo salvataggio");
			System.out.println();
		} catch (ClassNotFoundException e) {
			// gestisce il caso in cui il file non contenga un oggetto
			System.out.println("ERRORE di lettura");
			System.out.println(e);
		} catch (IOException e) {
			// gestisce altri errori di input/output
			System.out.println("ERRORE di I/O");
			System.out.println(e);
		}
	}
	
	// visualizza il contenuto del registro (il vettore) su schermo
	public void visualizza() {
		System.out.println();
		if (dati.isEmpty())
			System.out.println("Il registro e' vuoto!");
		else {
			System.out.println("REGISTRO DELLE ETA'");
			for (NomeEta ne : dati)
				System.out.println(ne);
		}
	}
	
	// consente di aggiungere una voce al registro
	public void inserisciNuovo(String nome, int eta) {
		NomeEta ne = new NomeEta(nome,eta);
		if (dati.contains(ne)) {
			System.out.println(nome + " già presente");
		} else {
			dati.add(ne);
			modificato=true; // modifica non salvata
		}
	}
	
	// incrementa (di uno) l'eta di una persona nel vettore
	// inoltre restituisce l'età aggiornata
	public int incrementaEta(String nome) {
		for (NomeEta ne: dati) {
			if (ne.getNome().equals(nome)) {
				ne.incrementaEta();
				modificato = true; // modifica non salvata
				return ne.getEta();
			}
		}
		return -1;
	}

	// verifica se ci sono modifiche non salvate
	public boolean daSalvare() {
		return modificato;
	}
	
	// salva il registro nel file
	// restituisce true se il salvataggio è andato a buon fine
	public boolean salva() {
		if (daSalvare()) { // salva solo se necessario (se ci sono modifiche)
			try {
				ObjectOutputStream file_output = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(nomefile)));
				// salva l'intero oggetto (vettore) nel file
				file_output.writeObject(dati);
				file_output.close();
				modificato = false; // le modifiche sono state salvate
				return true;
			} catch (IOException e) {
				System.out.println("ERRORE di I/O");
				System.out.println(e);
				return false;
			}		
		} else return true;
	}
}
