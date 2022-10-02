package week4.animali.mammiferi;

import week4.animali.classificazione.Animale;

/**
 * Created by mauro on 30/06/16.
 */
public class Cane extends Animale implements Mammifero{

    private String razza;
    private int anno;
    private String provenienza;

    public String getRazza() {
        return razza;
    }

    public void setRazza(String razza) {
        this.razza = razza;
    }

    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    public String getProvenienza() {
        return provenienza;
    }

    public void setProvenienza(String provenienza) {
        this.provenienza = provenienza;
    }

    @Override
    public int partorisce() {
        return 4;
    }

    @Override
    public String emetteSuoni() {
        return "Bau Bau";
    }
}
