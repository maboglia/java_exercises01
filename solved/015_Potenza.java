import java.util.Scanner;

public class Potenza
{

	public static void main( String []args )
	{
		Scanner s = new Scanner(System.in);

	System.out.print("a= ");
	int a=s.nextInt();

	System.out.print("n= ");
	int n=s.nextInt();

	int potenza=1, contatore=n;
	while( contatore>0 )
		{
		potenza *=a;
		contatore--;
		}
	System.out.println(a+"^"+n+"="+potenza);

		}//main

}//Potenza