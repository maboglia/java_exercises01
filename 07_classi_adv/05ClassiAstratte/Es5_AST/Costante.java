

public class Costante extends Operando {

  private int valore;
  
  public Costante(int v){
  	valore = v;
  }
  
  public int valuta(){
  	return valore;
  }

  public String stampa(){
  	return Integer.toString(valore);
  	//return ""+valore;
  	
  	//return (new StringBuffer((new String("")))).append(valore).toString();
  }
}
