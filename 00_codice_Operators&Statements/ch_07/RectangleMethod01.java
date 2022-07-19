// Rectangle Method
//
//    Computes: integral( x^3 ; x = 0 .. 1 )
//

public class RectangleMethod01
 {
   public static void main(String[] args)
   {

      double a, b, w, sum, x_i;
      int i, n;

      /* ---------------------------------------------------
         Initialize input values
         --------------------------------------------------- */
      a = 0.0;
      b = 1.0;
      n = 1000;

      /* ---------------------------------------------------
         The Rectangle Rule Algorithm
         --------------------------------------------------- */
      w = (b-a)/n;

      sum = 0.0;

      for ( i = 1; i <= n; i++ )
      {
         x_i = a + (i-1)*w;            
         sum = sum + ( w * (x_i * x_i * x_i) );    // f(x_i) = (x_i)^3
      }

      System.out.println("Approximate integral value = " + sum);
   }
}
