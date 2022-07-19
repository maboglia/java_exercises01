import java.util.Scanner;

public class Interest01
{
   public static void main(String[] args)
   {
      double principle, interest_rate;
      double p1, p2, p3;

      Scanner in = new Scanner(System.in);   // Construct a Scanner object
 
      System.out.print("Enter principle = "); 
      principle = in.nextDouble();             // Read in principle
      System.out.print("Enter interest rate = "); 
      interest_rate = in.nextDouble();              // Read in interest rate

      p1 = (1.0 + interest_rate/100.0) * principle;
      System.out.print("Principle after 1 year = ");
      System.out.println(p1);

      p2 = (1.0 + interest_rate/100.0) * p1;
      System.out.print("Principle after 2 year = ");
      System.out.println(p2);

      p3 = (1.0 + interest_rate/100.0) * p2;
      System.out.print("Principle after 3 year = ");
      System.out.println(p3);
   }
}
