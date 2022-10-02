

public class Variabile extends Operando {
  private int valore;
private String nome;
  
  public Variabile(int valore){
  	this.valore = valore; 
  }
  
  public Variabile(String nome, int valore){
  	this.valore = valore; 
  	this.nome = nome;
  }
  
  public int valuta(){
  	return valore;
  }

  public void assegna(int i) {
	valore = i;
  }

  public String stampa(){
  	return nome;
  }

}
