import java.util.Scanner;

public class GCD01
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

      a = min;

      while ( a >= 1 )             // Run a = min(x,y), min(x,y)-1, ..., 1
      {
         if ( x % a == 0  &&  y % a == 0 )
         {  // a is a divisor of x and y
            System.out.println(a);    // Print a (because it's a common divisor)

            break;                    // Exit while loop
         }
         else
         {
            a--;                      // Move to the next number !!
         }
      }
   }
}
