
public class AssignExpr06
{
   public static void main(String[] args)
   {
      int a, b;

      a = 4;
      b = 2 * --a + 1;

      System.out.println(a);
      System.out.println(b);

      a = 4;
      b = 2 * (a--  + 1); 

      System.out.println(a);
      System.out.println(b);
   }
}
