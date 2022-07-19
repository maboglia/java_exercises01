
public class ConvertChar01
{
   public static void main(String[] args)
   {
      char x;
 
      x = 'a';

      if ( x >= 'a' && x <= 'z' )
         x = (char) (x - 'a' + 'A');

      System.out.println("'a': " + x);

      x = 'H';

      if ( x >= 'a' && x <= 'z' )
         x = (char) (x - 'a' + 'A');

      System.out.println("'H': " + x);

      x = '%';

      if ( x >= 'a' && x <= 'z' )
         x = (char) (x - 'a' + 'A');

      System.out.println("'%': " + x);

   }
}
