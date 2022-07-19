import java.util.Scanner;

public class Divide01
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);

      int A, B;
      int Q, R;
 
      System.out.print("Enter A = ");
      A = in.nextInt();            // Read in number
      System.out.print("Enter B = ");
      B = in.nextInt();            // Read in number
      
      Q = 0;
      R = A;

      while ( R >= B ) 
      {
         Q = Q + 1;
         R = R - B;
      }

      System.out.println("Quotient = " + Q);
      System.out.println("Remainder = " + R);
   }
}
