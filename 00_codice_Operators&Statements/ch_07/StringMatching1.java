import java.util.Scanner;

public class StringMatching1
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);

      String T, P, cand;
      int pos;

      System.out.print("Enter a text string T: ");
      T = in.nextLine(); 
      System.out.print("Enter a pattern string P: ");
      P = in.next(); 
      
      for ( pos = 0; pos <= T.length() - P.length(); pos++ )
      {
         cand = T.substring( pos, pos+P.length() );  // Try to match this...

         if ( P.equals(cand) )
         {
            System.out.println("Found pattern at posistion: " + pos); // Found
         }
      }
   }
}
