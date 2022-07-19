import java.util.Scanner;

public class Divisors02
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);

      int x, y;
      int min = 0;
      int a;
 
      System.out.print("Enter a number x: ");
      x = in.nextInt();            // Read in number
      System.out.print("Enter a number y: ");
      y = in.nextInt();            // Read in number
      
      if ( x < y )
         min = x;
      else
         min = y;

      a = 1;

      while ( a <= min )             // Run a = 1, 2, ..., min(x,y)
      {
         if ( x % a == 0  &&  y % a == 0 )
         {  // a is a divisor of x and y
            System.out.println(a);   // Print a (because it's a common divisor)
         }

         a++;                        // Make sure we more to the next number !!
                                     // or else: infinite loop !!!
      }
   }
}
