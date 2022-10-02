package week4.prj_lavoratori;

/**
 * Created by mauro on 27/06/16.
 */
public class Dirigente extends Lavoratore{

    public Dirigente(String nome, String cognome){

        super(nome, cognome, "dirigente");

    }

    @Override
    public double getStipendio(int giorni) {
        double stipBase = super.getStipendio(giorni);
        return stipBase + (50 * giorni);

    }

    @Override
    public void testAbstract() {

    }
}
