import java.util.Scanner;

public class FindChar01
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);

      String x;
 
      System.out.print("Enter a word x = ");
      x = in.next();                // Read in a word
      
      int i;

      i = 0;

      while ( i <= x.length() - 1 )   // Run i = 0, 1, ..., x.length()-1
      {
         if ( x.charAt(i) == 'a' )
         {  // found 'a' at position i
            System.out.println(i);  // Print position i
         }

         i++;                       // Make sure we more to the next position !!
                                    // or else: infinite loop !!!
      }
   }
}
