/*
  La classe Auto1 eredita dalla classe Veicolo1 e aggiunge una caratteristica
  in piu', ossia il tipo (che puo' essere ad esempio: sport, familiare,...).
*/

public class Auto1 extends Veicolo1 {

    private String tipo;

    public Auto1(int nMatr, String nomePr, String tipoAuto) {
	super(nMatr, nomePr);
	tipo = tipoAuto;
    }

    public void assegnaTipo(String mioTipo) {
	tipo = mioTipo;
    }

    public String dammiTipo() {
	return tipo;
    }

    // riscrivo il metodo disegna() della superclasse:
    public String disegna() {
	return "disegno di un'auto";
    }
}
