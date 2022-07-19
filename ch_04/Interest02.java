import java.util.Scanner;

public class Interest02
{
   public static void main(String[] args)
   {
      double principle, interest_rate;

      Scanner in = new Scanner(System.in);   // Construct a Scanner object
 
      System.out.print("Enter principle = "); 
      principle = in.nextDouble();             // Read in principle
      System.out.print("Enter interest rate = "); 
      interest_rate = in.nextDouble();              // Read in interest rate

      principle = (1.0 + interest_rate/100.0) * principle;
      System.out.print("Principle after 1 year = ");
      System.out.println(principle);

      principle = (1.0 + interest_rate/100.0) * principle;
      System.out.print("Principle after 2 year = ");
      System.out.println(principle);

      principle = (1.0 + interest_rate/100.0) * principle;
      System.out.print("Principle after 3 year = ");
      System.out.println(principle);
   }
}
