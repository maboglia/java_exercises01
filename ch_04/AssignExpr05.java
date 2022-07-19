
public class AssignExpr05
{
   public static void main(String[] args)
   {
      int a, b;

      a = 4;
      b = ++a + 1;   // ++a evaluates to 5, 5 + 1 = 6

      System.out.println(a);  // Prints 5
      System.out.println(b);  // Prints 6

      a = 4;
      b = a++ + 1;   // a++ evaluates to 4, 4 + 1 = 5

      System.out.println(a);  // Prints 5
      System.out.println(b);  // Prints 5
   }
}
