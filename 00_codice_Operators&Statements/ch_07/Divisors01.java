import java.util.Scanner;

public class Divisors01
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);

      int n;
      int x;
 
      System.out.print("Enter a number n: ");
      n = in.nextInt();             // Read in number
      
      x = 1;

      while ( x <= n )              // Run x = 1, 2, ..., n
      {
         if ( n % x == 0 )
         {  // x is a divisor of n
            System.out.println(x);  // Print x (because it's a divisor)
         }

         x++;                       // Make sure we more to the next number !!
                                    // or else: infinite loop !!!
      }
   }
}
