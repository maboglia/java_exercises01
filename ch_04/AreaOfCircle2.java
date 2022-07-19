public class AreaOfCircle2
{
   public static void main(String[] args)
   {
      double r;               // variable containing the radius   
      double area;            // variable containing the area

      final double myPi = 3.14159265358979;
 
      r = 4;                  // Give the radius
      area = myPi * r * r;    // Compute the area of the circle

      System.out.print("The radius = "); 
      System.out.println(r);
      System.out.print("The area = "); 
      System.out.println(area); 
   }
}
