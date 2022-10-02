package week4.animali.classificazione;

/**
 * Created by mauro on 30/06/16.
 */
public abstract class Animale {

    protected String genere;
    protected String specie;

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }

    public String getSpecie() {
        return specie;
    }

    public void setSpecie(String specie) {
        this.specie = specie;
    }
}
