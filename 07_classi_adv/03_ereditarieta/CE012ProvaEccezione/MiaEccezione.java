package giorno1;

public class MiaEccezione extends Exception {
	public MiaEccezione() {
		super("Questa � la mia eccezione personalizzata");
	}
	
	public String maggioriDettagli() {
		return "qui maggiori dettagli sul problema";
	}
}
