public class Exercise2
{

   public static void main(String[] args) 
   {

      short a = 5;
      int   b = 2;
      double c = 1.0;
      double d = 5.0;

      System.out.println( a / b / c );
      System.out.println( a / c / b );

      System.out.println( a / b );
      System.out.println( d / b );

      System.out.println( (a + 0) / b );
      System.out.println( (d + 0) / b );

      System.out.println( (a + 0.0) / b );
      System.out.println( (d + 0.0) / b );
   }
}

