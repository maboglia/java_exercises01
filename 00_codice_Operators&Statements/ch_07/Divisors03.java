import java.util.Scanner;

public class Divisors03
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);

      int n;
      int x;
 
      System.out.print("Enter a number n: ");
      n = in.nextInt();              // Read in number
      
      for ( x = 1; x <= n ; x++ )    // Run x = 1, 2, ..., n
      {
         if ( n % x == 0 )
         {  // x is a divisor of n
            System.out.println(x);   // Print x (because it's a divisor)
         }
      }
   }
}
