public class StessiElementiB {

  public static void main(String[] args) {

    char[] a = {'a', 'b', 'c', 'd', 'e'};
    char[] b = {'c', 'f', 'a', 'e', 'g'};

    int cont=0;

    for (char x:a) {
      for (char y:b) {
        if (x==y) cont++;
      }
    }

    System.out.println(cont);
  }
}
