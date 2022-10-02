package view;

import classi01.innestate.Classe01Innestata;

/**
 * Created by marcuser on 31/01/19.
 */
public class ProvaClasseInnestata {
    public static void main(String[] args) {

        Classe01Innestata nested =new Classe01Innestata();

        nested.addStudente("mauro", 0xFCCCC);

        nested.reportStudenti();

    }
}
