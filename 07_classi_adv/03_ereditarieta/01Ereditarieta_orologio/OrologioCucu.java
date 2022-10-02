/*
  La classe OrologioCucu estende la classe Orologio; eredita tutti i
  metodi e sovrascrive il metodo dammiOra()
*/

public class OrologioCucu extends Orologio {

    public OrologioCucu(int h, int m, int s) {
	super(h, m, s);
    }

    // sovrascrivo il metodo della superclasse:
    public String dammiOra() {
	return "Orologio a cucu'. " + super.dammiOra();
    }

    // testo la classe: 

    public static void main(String[] a) {
	OrologioCucu mioCucu = new OrologioCucu(12, 23, 59);
	System.out.println(mioCucu.dammiOra());
	mioCucu.incrementaSecondi();
	System.out.println(mioCucu.dammiOra());
    }

}
