import java.util.Scanner;

public class Factor01
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);

      int x;
      int a;
 
      System.out.print("Enter a number x: ");
      x = in.nextInt();            // Read in number
      
      a = 2;

      while ( x > 1 )
      {
         if ( x % a == 0 )
         {  // a is a factor of x
            System.out.println(a);    // Print a (because it's a divisor)

            x = x / a;                // Remove factor a from x
         }
         else
         {
            a++;                      // Use next number as factor
         }
      }
   }
}
