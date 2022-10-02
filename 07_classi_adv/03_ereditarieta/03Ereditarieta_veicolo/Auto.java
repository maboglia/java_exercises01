/*
  La classe Auto eredita dalla classe Veicolo e aggiunge una caratteristica
  in piu', ossia il tipo (che puo' essere ad esempio: sport, familiare,...).
*/

public class Auto extends Veicolo {

    private String tipo;

    public void assegnaTipo(String mioTipo) {
	tipo = mioTipo;
    }

    public String dammiTipo() {
	return tipo;
    }
}
