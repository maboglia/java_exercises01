package model;

/**
 * Created by marcuser on 01/02/19.
 */
public class Giocatore {

    private String nome;
    private Ruolo ruolo;
    private byte numero;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Ruolo getRuolo() {
        return ruolo;
    }

    public void setRuolo(Ruolo ruolo) {
        this.ruolo = ruolo;
    }

    public byte getNumero() {
        return numero;
    }

    public void setNumero(byte numero) {
        this.numero = numero;
    }

    public Giocatore(String nome, Ruolo ruolo, byte numero) {
        this.nome = nome;
        this.ruolo = ruolo;
        this.numero = numero;
    }

}
