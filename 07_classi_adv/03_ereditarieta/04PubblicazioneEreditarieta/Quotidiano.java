
public class Quotidiano extends Rivista {

	private String giorno;
	public Quotidiano(String titolo, String anno, String autore, String rivista, String mese, String giorno) {
		super(titolo, anno, autore, rivista, mese);
		this.giorno = giorno;
	}

	public String getGiorno(){ return giorno; }
}
