// Utilizzo delle classi Scatola e ScatolaPesante
class UsoScatole{
	public static void main(String args[]){
		Scatola scat;
		ScatolaPesante scatPes = new ScatolaPesante();
		System.out.println("Proprieta della scatola:");
		/* Utilizzo di variabili di istanza ereditate
		dalla classe Scatola */
		scatPes.altezza = 3;
		scatPes.larghezza = 4;
		scatPes.profondità = 5;
		// Utilizzo delle variabili di istanza proprie
		scatPes.peso = 30;
		/* Utilizzo del metodo ereditato
		dalla classe Scatola */
		System.out.println("volume: " + scatPes.volume());
		// Utilizzo dei propri metodi
		System.out.println("superficie: " + scatPes.superficie());
		System.out.println("peso specifico: " + scatPes.pesoSpecifico());
		// Assegnazione del riferimento alla variabile scat
		scat = scatPes;
		/* Questo e' possibile perche' un oggetto di tipo
		ScatolaPesante e' anche un oggetto di tipo Scatola.
		Tramite la variabile scat di tipo Scatola si puo'
		accedere solo alle proprieta' e ai metodi definiti
		nella classe Scatola */
		System.out.println("Accesso tramite variabile di tipo Scatola");
		// utilizzo dei metodi della classe scatola
		System.out.println("volume: " + scat.volume());
		// la riga seguente e' commentata perche errata
		/* System.out.println("peso specifico: " + scat.peso Specifico()); */
	}
}