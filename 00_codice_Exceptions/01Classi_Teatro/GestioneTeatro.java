import java.io.*; // importo il pacchetto per l'Input Output

public class GestioneTeatro {

    public static void main(String[] s) {

	// creo un oggetto per leggere dati dalla finestra di console
        BufferedReader console = new BufferedReader(
       	    new InputStreamReader(System.in));



	Attore attore1 = new Attore();
	Attore attore2 = new Attore();
	Attore attore3 = new Attore();

	System.out.println("Dammi il mome dell'attore N.: 1");
	// leggo la stringa:
	try {
	    attore1.setNome(console.readLine());
	}
        catch (IOException e) {
            System.out.println("Errore di input");
            System.exit(1);
	}
	System.out.println("Giorno dell'ingaggio?");
        boolean datoErrato = true;
	do {
            try
            {
                String inputA = console.readLine();
                // converto la stringa in intero:
                attore1.setGiorno(Integer.parseInt(inputA));
                datoErrato = false;
            }
            catch (NumberFormatException e)
            {
                System.out.println("devi darmi un intero! Riprova: ");
            }
           catch (IOException e) {
                System.out.println("Errore di input");
                System.exit(1);
            }
        }
        while (datoErrato);

	System.out.println("Mese dell'ingaggio?");
        datoErrato = true;
	do {
            try
            {
                String inputA = console.readLine();
                // converto la stringa in intero:
                attore1.setMese(Integer.parseInt(inputA));
                datoErrato = false;
            }
            catch (NumberFormatException e)
            {
                System.out.println("devi darmi un intero! Riprova: ");
            }
           catch (IOException e) {
                System.out.println("Errore di input");
                System.exit(1);
            }
        }
        while (datoErrato);

	// ripeto la stessa cosa per attore2 e attore3 (con gli 
	// array questa parte si potrebbe fare in modo molto piu'
	// semplice!)

	System.out.println("Dammi il mome dell'attore N.: 2");
	// leggo la stringa:
	try {
	    attore2.setNome(console.readLine());
	}
        catch (IOException e) {
            System.out.println("Errore di input");
            System.exit(1);
	}
	System.out.println("Giorno dell'ingaggio?");
        datoErrato = true;
	do {
            try
            {
                String inputA = console.readLine();
                // converto la stringa in intero:
                attore2.setGiorno(Integer.parseInt(inputA));
                datoErrato = false;
            }
            catch (NumberFormatException e)
            {
                System.out.println("devi darmi un intero! Riprova: ");
            }
           catch (IOException e) {
                System.out.println("Errore di input");
                System.exit(1);
            }
        }
        while (datoErrato);

	System.out.println("Mese dell'ingaggio?");
        datoErrato = true;
	do {
            try
            {
                String inputA = console.readLine();
                // converto la stringa in intero:
                attore2.setMese(Integer.parseInt(inputA));
                datoErrato = false;
            }
            catch (NumberFormatException e)
            {
                System.out.println("devi darmi un intero! Riprova: ");
            }
           catch (IOException e) {
                System.out.println("Errore di input");
                System.exit(1);
            }
        }
        while (datoErrato);

	// attore 3:
	System.out.println("Dammi il mome dell'attore N.: 3");
	// leggo la stringa:
	try {
	    attore3.setNome(console.readLine());
	}
        catch (IOException e) {
            System.out.println("Errore di input");
            System.exit(1);
	}
	System.out.println("Giorno dell'ingaggio?");
        datoErrato = true;
	do {
            try
            {
                String inputA = console.readLine();
                // converto la stringa in intero:
                attore3.setGiorno(Integer.parseInt(inputA));
                datoErrato = false;
            }
            catch (NumberFormatException e)
            {
                System.out.println("devi darmi un intero! Riprova: ");
            }
           catch (IOException e) {
                System.out.println("Errore di input");
                System.exit(1);
            }
        }
        while (datoErrato);

	System.out.println("Mese dell'ingaggio?");
        datoErrato = true;
	do {
            try
            {
                String inputA = console.readLine();
                // converto la stringa in intero:
                attore3.setMese(Integer.parseInt(inputA));
                datoErrato = false;
            }
            catch (NumberFormatException e)
            {
                System.out.println("devi darmi un intero! Riprova: ");
            }
           catch (IOException e) {
                System.out.println("Errore di input");
                System.exit(1);
            }
        }
        while (datoErrato);

	/// Stampo il programma del teatro: 
	System.out.println("\n\n\n\n\n");
	System.out.println("********** Programma del teatro: ***********");
	System.out.println(attore1.getNome());
	System.out.println(attore1.getData());
	System.out.println();
	System.out.println(attore2.getNome());
	System.out.println(attore2.getData());
	System.out.println();
	System.out.println(attore3.getNome());
	System.out.println(attore3.getData());
	System.out.println();
    }
}
