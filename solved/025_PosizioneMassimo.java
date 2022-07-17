import java.util.Scanner;

public class PosizioneMassimo {

  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);

    int n;
    int max;
    int posmax=1;

    System.out.println("Inserisci un numero");
    max = input.nextInt();

    for (int i=2; i<=10; i++) {
      System.out.println("Inserisci un numero");
      n = input.nextInt();
      if (n>max) {
        max = n;
        posmax = i;
      }
    }

    System.out.println("valore massimo in posizione " + posmax);
  }

}
