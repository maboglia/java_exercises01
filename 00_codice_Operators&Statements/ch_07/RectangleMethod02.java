// Rectangle Method
//
//    Computes: integral( 1/x; x = 1..2)
//

public class RectangleMethod02
 {
   public static void main(String[] args)
   {

      double a, b, w, sum, x_i;
      int i, n;

      /* ---------------------------------------------------
         Initialize input values
         --------------------------------------------------- */
      a = 1.0;
      b = 2.0;
      n = 1000;

      /* ---------------------------------------------------
         The Rectangle Rule Algorithm
         --------------------------------------------------- */
      w = (b-a)/n;

      sum = 0.0;

      for ( i = 1; i <= n; i++ )
      {
         x_i = a + (i-1)*w;            
         sum = sum + ( w * (1/x_i) );    // f(x_i) = 1/x_i
      }

      System.out.println("Approximate integral value = " + sum);
   }
}
