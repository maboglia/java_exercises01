/*
 * Created on 21-mag-2003
 *
 * To change the template for this generated file go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */

public class Prodotto extends Operatore {
  public Prodotto(Espressione prima, Espressione seconda) {
  	super(prima,seconda);
  }

  public int valuta(){
  	return primo.valuta()*secondo.valuta();
  }

  public String stampa(){
  	return "("+primo.stampa()+"*"+secondo.stampa()+")";
  }
}
