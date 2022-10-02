package week4.prj_lavoratori;

/**
 * Created by mauro on 27/06/16.
 */
public class Impiegato extends Lavoratore {

    public Impiegato(String nome, String cognome){

        super(nome, cognome, "impiegato");

    }

    @Override
    public double getStipendio(int giorni) {
        double stipBase = super.getStipendio(giorni);
        return stipBase + (10 * giorni);
    }

    @Override
    public void testAbstract() {

    }
}
