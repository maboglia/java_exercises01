/* La classe eredita dalla classe Lavoratore. Ha un costruttore
   e ridefinisce il metodo stipendio.
*/

public class Capo extends Lavoratore {


    public Capo(String nm, String cgn) {
	super(nm, cgn);
    }

    public double stipendio(int giorni) {
	double stipBase = super.stipendio(giorni);
	return stipBase + 1000*giorni;
    }

}
