
import java.util.Scanner;


public class Parse01
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);

      String s, t;

      System.out.print("Enter line:");
      s = input.nextLine();
 
      System.out.println("Input line = `" + s + "'");

      int left, right;

      left = 0;

      while ( left < s.length() )
      {
         /* --------------------------------------------------------
            Situation right now:

               0123456789012345
               sssxxxxxxsssxxxs       (s = space, x = non-space)
               ^
               |
              left=0

            Next task: Skip leading spaces
            -------------------------------------------------------- */
         while ( s.charAt(left) == ' ' )
            left++;

         /* ------------------------------------------------------
            Achieved: left points to the first non-space character

            Situation right now:

               0123456789012345
               sssxxxxxxsssxxxs       (s = space, x = non-space)
                  ^
                  |
                 left=3

            I.e.: we found the start of the next word

            Next task: find the end of the word
            ------------------------------------------------------ */

         /* ------------------------------
            Look for the end of the word
            ------------------------------ */
         right = left+1;
         while ( s.charAt(right) != ' ' )
            right++;

         /* ------------------------------------------------------
            Achieved: right points to the first space character
            I.e.: we found the end of the next word

            Situation right now:

               0123456789012345
               sssxxxxxxsssxxxs       (s = space, x = non-space)
                  ^     ^
                  |     |
                left=3  right=9
            ------------------------------------------------------ */

         t = s.substring(left, right);  // Extract word found

         System.out.println("Next word found: `" + t + "'");

         /* ------------------------------------------------------
            PREPARE to LOOP !!!

            First task of loop is: Skip leading spaces
            We need to set up left !!!

            Situation right now:

               0123456789012345
               sssxxxxxxsssxxxs       (s = space, x = non-space)
                  ^     ^
                  |     |
                left=3  right=9

            Situation you need to be to restart loop:

               0123456789012345
               sssxxxxxxsssxxxs       (s = space, x = non-space)
                        ^
                        |
                        left=9  (so the loop can find next word !)
            ------------------------------------------------------ */
         left = right;
      }
   }
}
