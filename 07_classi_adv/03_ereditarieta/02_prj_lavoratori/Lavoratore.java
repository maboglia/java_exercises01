package week4.prj_lavoratori;

/**
 * La classe Lavoratore definisce le caratteristiche di un  lavoratore base.
 */
public abstract class Lavoratore {

    String nome, cognome, matricola;

    static int contatore = 0;


    /**
     * definisco la paga base
     *
     * */
    public static final double PAGA_BASE = 25;


    /**
     * Costruisci l'oggetto lavoratore passando
     *
     * @param nome
     * @param cognome
     * @param matricola
     */
    public Lavoratore(String nome, String cognome, String matricola) {
        contatore++;
        this.nome = nome;
        this.cognome = cognome;
        this.matricola = matricola + "-" + contatore;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getNomeCompleto() {
        return nome + " " + cognome;
    }

    public double getStipendio(int giorni){

        return giorni * PAGA_BASE;
    }

    public abstract void testAbstract();


}
