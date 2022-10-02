public class MiaEccezione extends Exception {
	
	public MiaEccezione(){
		super("MiaEccezione");
	}
	
	public String dettagli(){
		return "Dettagli della mia eccezione";
	}
}