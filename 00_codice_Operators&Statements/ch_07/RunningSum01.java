import java.util.Scanner;

public class RunningSum01
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);

      int n;
      int x, sum;
 
      System.out.print("Enter a number n: ");
      n = in.nextInt();            // Read in number
      
      sum = 0;

      for ( x = 1; x <= n ; x++ )    // Run x = 1, 2, ..., n
      {
         sum = sum + x;
      }

      System.out.println(sum);    // Print final sum
   }
}
