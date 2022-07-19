public class Abc
{
   public static void main(String[] args)
   {
      double a, b, c, x1, x2;   // Define 5 variable 
 
      a =  1.0;
      b =  0.0;
      c = -4.0;


      x1 = ( -b - Math.sqrt( b*b - 4*a*c ) ) / (2*a);
      x2 = ( -b + Math.sqrt( b*b - 4*a*c ) ) / (2*a);

      System.out.print("a = ");
      System.out.println(a);
      System.out.print("b = ");
      System.out.println(b);
      System.out.print("c = ");
      System.out.println(c);
      System.out.print("x1 = ");
      System.out.println(x1);
      System.out.print("x2 = ");
      System.out.println(x2);
   }
}
