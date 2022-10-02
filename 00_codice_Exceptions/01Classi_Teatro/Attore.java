/*
  Questa classe permette di definire un attore. Un attore ha un nome, 
  e puo' essere ingaggiato per uno spettacolo in un certo giorno.
*/

public class Attore {

    private String nomeAttore; //nome dell'attore ingaggiato;
    // giorno e mese dell'spettacolo:
    private int giorno;
    private int mese;

    public void setNome(String nm) {
	nomeAttore = nm;
    }

    public void setGiorno(int gg) {
	if (gg < 1 || gg > 31) {
	    System.out.println("Giorno errato!");
	    return;
	}
	giorno = gg;
    }

    public void setMese(int m) {
	if (m < 1 || m > 12) {
	    System.out.println("Mese errato!");
	    return;
	}
	mese = m;
    }

    public String getNome() {
	return nomeAttore;
    }

    public String getData() {
	return "Data spettacolo: " + giorno + "/" + mese;
    }
}
