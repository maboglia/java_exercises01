import java.util.Scanner;

public class Divisible01
{
   public static void main(String[] args)
   {
      int a, b;
 
      Scanner in = new Scanner(System.in); // Construct Scanner object  
 
      System.out.print("Enter a: ");
      a = in.nextInt();  // Read in number into a
      System.out.print("Enter b: ");
      b = in.nextInt();  // Read in number into b

      if ( (a % b) == 0 )
         System.out.println(a + " is divisible by " + b);
   }
}
