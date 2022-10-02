package classi01.innestate;

import java.util.ArrayList;

/**
 * Created by marcuser on 31/01/19.
 */
public class Classe01Innestata {


    public ArrayList<Studente> studenti;

    {
        System.out.println("inizializzazione");
        studenti = new ArrayList<>();
        studenti.add(new Studente("Test", 0xDA9100));
    }

    public Classe01Innestata() {
        System.out.println("Costruttore");
    }

    public Classe01Innestata(int nStudenti, String studente, long matricola) {
        for (int i = 1; i <= nStudenti; i++) {
            studenti.add(new Studente(studente, matricola));
        }
    }

    public void addStudente(String studente, long matricola) {
        studenti.add(new Studente(studente, matricola));
    }

    public void reportStudenti() {
        class ClasseInterna {
            public void open() {
                System.out.println("Sonola classe interna...");
                System.out.println("Ciao!");
            }
        }
        new ClasseInterna().open();

        for (Studente o : studenti) {
            System.out.println("E' lo studente " + o.studente + " a rispondere!!");
        }
    }


    class Studente {

        public static final long MATRICOLA = 0x000001;

        public String studente;
        public long matricola = MATRICOLA;

        public Studente() {
        }

        public Studente(String studente) {
            this.studente = studente;
        }

        public Studente(String studente, long matricola) {
            this(studente);
            this.matricola = matricola;
        }

        public String toString() {
            return "name: " + this.studente + ": " + "matricola: " +  this.matricola;
        }

    }


}
