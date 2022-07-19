
public class Overflow
{
   public static void main(String[] args)
   {
      int x, y, z;
      long a, b, c;

      x = 1000000;
      y = 3000;

      z = x * y;       // 3,000,000,000 is outside the range of int
      System.out.println(z); 

      a = 1000000;
      b = 3000;

      c = a * b;       // 3,000,000,000 is within the range of long
      System.out.println(c); 

   }
}
