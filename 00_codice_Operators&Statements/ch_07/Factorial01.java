import java.util.Scanner;

public class Factorial01
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);

      int n;
      int x, product;
 
      System.out.print("Enter a number n: ");
      n = in.nextInt();              // Read in number
      
      product = 1;                   // Start init product = 1

      for ( x = 1; x <= n ; x++ )    // Run x = 1, 2, ..., n
      {
         product = product * x;
      }

      System.out.println(product);   // Print final product
   }
}
