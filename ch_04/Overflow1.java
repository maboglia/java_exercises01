
public class Overflow1
{
   public static void main(String[] args)
   {
      double d;     // range: -10^(308) .. 10^(308) 
      float f;      // range: -10^(38) .. 10^(38)

      d = 3.1415e100;    // In range of "double", out of range of "float"
      f = (float) d;

      System.out.print("d = ");
      System.out.println(d);
      System.out.print("f = ");
      System.out.println(f);
   }
}
