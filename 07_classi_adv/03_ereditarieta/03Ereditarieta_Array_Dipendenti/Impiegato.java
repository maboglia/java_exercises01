/* La classe eredita dalla classe Lavoratore. Ha un costruttore
   e ridefinisce il metodo stipendio.
*/

public class Impiegato extends Lavoratore {


    public Impiegato(String nm, String cgn) {
	super(nm, cgn);
    }

    public double stipendio(int giorni) {
	double stipBase = super.stipendio(giorni);
	return stipBase + 10*giorni;
    }

}
