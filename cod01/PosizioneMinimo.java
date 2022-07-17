import java.util.Scanner;

public class PosizioneMinimo {

  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);

    int n;
    int min;
    int posmin=1;

    System.out.println("Inserisci un numero");
    min = input.nextInt();

    for (int i=2; i<=10; i++) {
      System.out.println("Inserisci un numero");
      n = input.nextInt();
      if (n<min) {
        min = n;
        posmin = i;
      }
    }

    System.out.println("valore minimo in posizione " + posmin);
  }

}
