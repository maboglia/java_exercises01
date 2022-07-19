import java.util.*;

public class Inverso{
	public static void main(String [] args){

			//chiedo la grandezza dell'array
			Scanner s = new Scanner(System.in);
			System.out.println("Inserire la dimensione dell'array");
			int n = s.nextInt();
			
			//dichiaro e creo un array di n interi
			int [] a = new int[n];
			
			//chiedo gli n numeri da inserire nell'array
			for (int i=n-1; i>=0; i--){
				System.out.println("Inserire l'elemento: ");
				a[i]=s.nextInt();
			}

			//stampo l'array a			
			System.out.print("ARRAY A: "); 
			for (int i=0; i<n; i++){
				//stampa elemento
				System.out.print(" [" + a[i] + "]"); 
			}
		}
		

}
