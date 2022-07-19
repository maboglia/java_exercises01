
public class AssignExpr04
{
   public static void main(String[] args)
   {
      int a, b, c;

      a = 1;
      b = 1;
      c = 2;

      c *= b -= a += 1 + 2;

      System.out.println(a);
      System.out.println(b);
      System.out.println(c);
   }
}
