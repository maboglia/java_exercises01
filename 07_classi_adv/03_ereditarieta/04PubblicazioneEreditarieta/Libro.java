


public class Libro extends Pubblicazione {

   String editore;
   
   public Libro(String t, String a, String au, String e){
	 super(t,a,au); // richiama il costruttore di Pubblicazione
   	 this.editore = e;
   }
   
   public void print(){
		System.out.println(autore + ", " + titolo + ", " + editore + ", " + anno);
   }
}
