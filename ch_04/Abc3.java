
import java.util.Scanner;   // Import Scanner class (contains methods
                            // for reading keyboard input)


public class Abc3
{
   public static void main(String[] args)
   {
      double a, b, c, x1, x2;   // Define 5 variable 

      Scanner in = new Scanner(System.in);   // Construct a Scanner object
 
      System.out.print("Enter a = ");   // ******* Prompt message
      a = in.nextDouble();  // Read in next number and store in a 
      System.out.print("Enter b = ");
      b = in.nextDouble();  // Read in next number and store in b
      System.out.print("Enter c = ");
      c = in.nextDouble();  // Read in next number and store in c 

      x1 = ( -b - Math.sqrt( b*b - 4*a*c ) ) / (2*a);
      x2 = ( -b + Math.sqrt( b*b - 4*a*c ) ) / (2*a);

      System.out.print("a = ");
      System.out.println(a);
      System.out.print("b = ");
      System.out.println(b);
      System.out.print("c = ");
      System.out.println(c);
      System.out.print("x1 = ");
      System.out.println(x1);
      System.out.print("x2 = ");
      System.out.println(x2);
   }
}
