


public class Rivista extends Pubblicazione {

	protected String mese;
	protected String rivista;
	
	public Rivista(String t, String a, String au, String rivista, String m){
		super(t,a,au);
		this.mese = m;
		this.rivista = rivista; 
	}

	public void print(){
		System.out.println("R: " + autore + ", " + titolo + ", " + rivista + ", " + mese + ", " + anno);
	}
	
}
