// Solves: x^3 + x - 3 = 0

public class Bisection02
{
   public static void main(String[] args)
   {
      final double epsilon = 0.00001;
      double a, b, m, y_m, y_a;

      a = 0;  b = 4;
      System.out.println("Initial interval: [" + a + " .. " + b + "]");

      while ( (b-a) > epsilon )
      {
         m = (a+b)/2;                 // Mid point

         y_m = m*m*m + m - 3.0;       // y_m = f(m)
         y_a = a*a*a + a - 3.0;       // y_a = f(a)

         if ( (y_m > 0 && y_a < 0) || (y_m < 0 && y_a > 0) )
         {  // f(a) and f(m) have different signs: move b
            b = m;
         }
         else
         {  // f(a) and f(m) have same signs: move a
            a = m;
         }
      
         System.out.println("New interval: [" + a + " .. " + b + "]");
      }

      System.out.println("Approximate solution = " + (a+b)/2 );
   }
}
