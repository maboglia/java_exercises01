import java.util.Scanner;

public class DanglingElse01
{
   public static void main(String[] args)
   {
      int country_code, state_code;
      double cost;
 
      Scanner in = new Scanner(System.in); // Construct Scanner object  
 
      System.out.print("Enter country code: ");
      country_code = in.nextInt();                // Read in integer
      System.out.print("Enter state code: ");
      state_code = in.nextInt();                  // Read in integer 

      cost = 5.0; 

      if ( country_code == 1 )
         if ( state_code == 50 )
            cost = 10.0;           // Hawaii
      else
         cost = 20.0;              // Outside US

      System.out.println("Shipping cost = " + cost);
   }
}
