
public class UnSafe
{
   public static void main(String[] args)
   {
      int x;           // x uses 4 bytes
      short y;         // y uses 2 bytes

      x = 65538;       // 65538 = 2^16 + 2
                       // Binary: 00000000 00000001 00000000 00000010

      y = (short) x;   // Unsafe conversion
                       // y = 00000000 00000010 (lower half of x)
                       // (Correct for numbers < 65535)

      System.out.println(y); 
   }
}
