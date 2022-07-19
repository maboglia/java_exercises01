import java.lang.Math;   // Not needed... already done by Java compiler

public class Sqrt
{
   public static void main(String[] args)
   {
      double a, b, c;
 
      a = 2.0;
      b = Math.sqrt(a);
      c = 2.0*Math.sqrt(a) + 1.0;

      System.out.print("a = ");
      System.out.println(a);
      System.out.print("Sqrt of a = ");
      System.out.println(b);
      System.out.print("2*sqrt(a) + 1 = ");
      System.out.println(c);
   }
}
