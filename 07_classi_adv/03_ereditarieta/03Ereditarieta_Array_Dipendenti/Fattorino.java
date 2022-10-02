/* La classe Fattorino eredita dalla classe Lavoratore. 
   Ha un costruttore e riscrive il metodo stipendio() della
   superclasse per adattarlo.
*/

public class Fattorino extends Lavoratore {


    public Fattorino(String nm, String cgn) {
	super(nm, cgn);
    }

    public double stipendio(int giorni) {
	double stipBase = super.stipendio(giorni);
	return stipBase/2;
    }

}
