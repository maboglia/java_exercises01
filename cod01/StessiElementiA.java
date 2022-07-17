public class StessiElementiA {

  public static void main(String[] args) {

    int[] a = {4, 5, 2, 3, 1};
    int[] b = {6, 2, 3, 7, 5};

    int somma=0;

    for (int x:a) {
      for (int y:b) {
        if (x==y) somma+=x;
      }
    }

    System.out.println(somma);
  }
}
