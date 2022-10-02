

public class Somma extends Operatore {
  public Somma(Espressione prima, Espressione seconda) {
  	super(prima,seconda);
  }

  public int valuta(){
  	return primo.valuta()+secondo.valuta();
  }
  
  public String stampa(){
  	return "("+primo.stampa()+"+"+secondo.stampa()+")";
  }

}
