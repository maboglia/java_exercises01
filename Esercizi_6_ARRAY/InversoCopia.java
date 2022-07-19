import java.util.*;

public class InversoCopia{
	public static void main(String [] args){

			//chiedo la grandezza dell'array
			Scanner s = new Scanner(System.in);
			System.out.println("Inserire la dimensione dell'array");
			int n = s.nextInt();
			
			//dichiaro e creo un array a di n interi
			int [] a = new int[n];
			
			int r=0; //variabile in cui salvo momentaneamnete i valori
			
			//genero n numeri casuali e li salvo nell'array
			for (int i=0; i<n; i++){
				r = (int) ( Math.random( ) * 100);
				a[i] = r;
			}

			//dichiaro e creo un array b di n interi
			int [] b = new int[n];
			
			int j = 0;
			
			/***
			* Scorro l'array a in ordine inverso e lo salvo in b.
			* Per scorrere b utilizzo un contatore manuale j.
			***/
			for (int i=n-1; i>=0; i--){
				b[j] = a[i];
				j++; //incremento il contatore perchè è manuale
			}
			
			//stampo gli array a e b			
			System.out.print("ARRAY A: "); 
			for (int i=0; i<n; i++){
				//stampa elemento
				System.out.print(" [" + a[i] + "]"); 
			}
			System.out.println("\n\n");
			System.out.print("ARRAY B: "); 
			for (int i=0; i<n; i++){
				//stampa elemento
				System.out.print(" [" + b[i] + "]"); 
			}			
			
		}
		

}
