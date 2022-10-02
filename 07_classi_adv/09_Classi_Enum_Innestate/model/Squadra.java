package model;

import java.util.ArrayList;

/**
 * Created by marcuser on 01/02/19.
 */
public class Squadra {

    public ArrayList<Giocatore> giocatori;

    {
        System.out.println("inizializza squadra");
        giocatori = new ArrayList<>();
        giocatori.add(new Giocatore("Buffone",Ruolo.PORTIERE, (byte) 1));
    }

    public void addGiocatore(String n, Ruolo ruolo, int i) {

        giocatori.add(new Giocatore(n,ruolo, (byte) 1));

    }

    public void reportSquadra() {

        new Object() {
            public void open() {
                System.out.println("La squadra scende in campo con una formazione...");
                System.out.println("Super!");
            }
        } .open();

        for (Giocatore g : giocatori) {
            System.out.println(g.getNumero() + " " + g.getNome() + " giocatore!!");
        }
    }
}
