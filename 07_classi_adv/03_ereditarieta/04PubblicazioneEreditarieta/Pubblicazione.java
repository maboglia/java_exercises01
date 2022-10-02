


public class Pubblicazione {
  
  protected String titolo;
  protected String anno;
  protected String autore;
  
//  public Pubblicazione(){
//  }
  
  public Pubblicazione(String t, String a, String au){
  	this.titolo = t;
  	this.anno = a;
  	this.autore = au;
  }
  
  public void print(){
  	System.out.println("P: " + autore + ", " + titolo + ", " + anno);
  }
}
