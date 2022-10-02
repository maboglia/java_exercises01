package week4.animali.mammiferi;

import week4.animali.classificazione.Animale;

/**
 * Created by mauro on 30/06/16.
 */
public class Gatto extends Animale implements Mammifero {
    @Override
    public int partorisce() {
        return 3;
    }

    @Override
    public String emetteSuoni() {
        return "Miao Miao";
    }
}
