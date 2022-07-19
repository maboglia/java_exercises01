import java.util.Scanner;

public class Hours
{
   public static void main(String[] args)
   {
      int n, hours, minutes, seconds;

      Scanner in = new Scanner(System.in);

      System.out.print("Enter # seconds: ");
      n = in.nextInt();           // n = total number of seconds

      seconds = n % 60;    // computes seconds

      n = n / 60;          // n is now = remaining minutes       
      
      minutes = n % 60;    // computes minutes

      n = n / 60;          // n is now = remaining hours

      hours = n;

      System.out.print(n); 
      System.out.print(" seconds = ");
      System.out.print(hours); 
      System.out.print(" hours + ");
      System.out.print(minutes); 
      System.out.print(" minutes+ ");
      System.out.print(seconds); 
      System.out.println(" seconds.");
   }
}
