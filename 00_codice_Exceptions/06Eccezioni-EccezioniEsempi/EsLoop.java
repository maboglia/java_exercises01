import java.util.StringTokenizer;

/**
 * Esempio di combinazione di loop e gestione delle eccezioni
 */
public class EsLoop {

	public static void main(String[] args) {
		String elenco = "123,k321,543,67,77";

		System.out.println("------ Tollerante -----");
		leggiElencoNumeriTollerante(elenco);
		
		System.out.println("------ Drastico -----");
		leggiElencoNumeriDrastico(elenco);

	}

	/**
	 * Legge un elenco di numeri. In presenza di un
	 * errore si comporta in maniera tollerante
	 * e prosegue la lettura.
	 * 
	 * @param elenco
	 *            l'elenco di numeri da leggere separati da ','
	 */
	private static void leggiElencoNumeriTollerante(String elenco) {
		StringTokenizer st = new StringTokenizer(elenco, ",");

		while (st.hasMoreTokens()) {
			try {
				String token = st.nextToken();
				int j = Integer.parseInt(token);
				System.out.println(j);
			} catch (NumberFormatException nfe) {
				System.out.println("Errore " + nfe.getMessage());
			}
		}
	}

	/**
	 * Legge un elenco di numeri. In presenza di un
	 * errore si comporta in maniera drastica
	 * e termina la lettura.
	 * 
	 * @param elenco l'elenco di numeri da leggere separati da ','
	 */
	private static void leggiElencoNumeriDrastico(String elenco) {
		StringTokenizer st = new StringTokenizer(elenco, ",");

		try {
			while (st.hasMoreTokens()) {
				String token = st.nextToken();
				int j = Integer.parseInt(token);
				System.out.println(j);
			}
		} catch (NumberFormatException nfe) {
			System.out.println("Errore " + nfe.getMessage());
		}
	}
}