public class ContoCorrente {

	// variabili di istanza
	private int numero; // numero del conto
	private double saldo; // saldo attuale del conto
	private String tipo; // tipologia di cliente: "family" o "business"
	
	// variabili statiche
	private static double tassoFamily = 0.02;   // tasso applicato ai clienti "family"
	private static double tassoBusiness = 0.03; // tasso applicato ai clienti "business"
	private static int numeroUltimoContoCreato=1000; // numero ultimo conto corrente creato

	// costruttore della classe
	public ContoCorrente(String tipoCliente, double saldoIniziale) {
		
		numero=numeroUltimoContoCreato+1;
		numeroUltimoContoCreato++;
		
		saldo=saldoIniziale;
		
		if (tipoCliente.equals("family")||tipoCliente.equals("business"))
			tipo=tipoCliente;
		else {
			// se il tipoCliente ricevuto è sbagliato imposta "family"
			System.out.println("Creazione conto " + numero + ": tipo " + tipoCliente + " errato!");
			tipo="family";
		}
	}

	// metodo per il versamento di somme
	public void versa(double somma) {
		saldo+=somma;
		System.out.println("[conto:" + numero + "] Versati: " + somma + " euro");
	}

	// metodo per il prelievo di somme
	public boolean preleva(double somma) {
		if (saldo<somma) return false;
		else {
			saldo-=somma;
			System.out.println("[conto:" + numero + "] Prelevati: " + somma + " euro");
			return true;
		}
	}

	// metodo che calcola gli interessi
	public void maturaInteressi() {
		if (tipo.equals("family"))
			saldo += saldo*tassoFamily;
		else
			saldo += saldo*tassoBusiness;
	}
	
	//metodo che restituisce il saldo del conto
	public double ottieniSaldo() {
		return saldo;
	}
	
	//metodo che restituisce il numero del conto
	public int ottieniNumero() {
		return numero;
	}
	
	public static void modificaTassoFamily(double nuovoTasso) {
		tassoFamily = nuovoTasso;
	}

	public static void modificaTassoBusiness(double nuovoTasso) {
		tassoBusiness = nuovoTasso;
	}
}