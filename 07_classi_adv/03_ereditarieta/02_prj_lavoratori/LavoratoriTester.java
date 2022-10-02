package week4.prj_lavoratori;

import java.util.ArrayList;

/**
 *
 */
public class LavoratoriTester {

    public static void main(String[] args) {

        int numGiorni = (int) (1 + Math.random() * 31);

        ArrayList<Lavoratore> personale = new ArrayList<>();

        String[] dirigenti = {"Lorena Pennacchi", "Mario Vargass Llosa"};
        String[] impiegati = {"Paolino Paperino", "Pluto Pluti", "Pippo Pippi"};
        String[] fattorini = {"fattorino 1", "fattorino 2","fattorino 3"};


        for(String dip : dirigenti){
            int spazio = dip.indexOf(" ");
            String nome = dip.substring(0, spazio);
            String cognome = dip.substring(spazio+1);

            personale.add(new Dirigente(nome, cognome));

        }

        personale.add(new Impiegato("paolino", "paperino"));
        personale.add(new Impiegato("paolina", "paperina"));
        personale.add(new Impiegato("pippo", "pippi"));

        personale.add(new Fattorino("fattorino", "uno"));
        personale.add(new Fattorino("fattorino", "due"));
        personale.add(new Fattorino("fattorino", "tre"));
        personale.add(new Fattorino("fattorino", "quattro"));
        personale.add(new Fattorino("fattorino", "5"));

        //personale.add(new Lavoratore("Mauro", "Bogliaccino", "fuoriQuota"));

        System.out.println("I giorni lavorativi del mese sono: " + numGiorni);

        System.out.println();

        for (Lavoratore l:personale
             ) {
            System.out.println("Lo stipendio di " + l.getNomeCompleto() + " ammonta euro: " + l.getStipendio(numGiorni));
        }


    }
}
