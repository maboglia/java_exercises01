/**
 * Esempio di gestione di una RuntimeException 
 */
public class EsNumeri {

  public static void main(String[] args) {

    // ok.
    leggiNumero("123");
    
    // segnala errore
    leggiNumero("k123");

  }
  
  public static void leggiNumero(String s){
    int i = 0;
    try {
      System.out.println("Parsing di " + s);
      i = Integer.parseInt(s);
      i++;
      System.out.println("i= " + i);
    } catch (NumberFormatException nfe) {
      System.out.println("Numero non valido:" + nfe.getMessage());
      i--;
      nfe.printStackTrace(System.out);
    }
  }
}
