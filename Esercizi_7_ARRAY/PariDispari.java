import java.util.*;

public class PariDispari{
	public static void main(String [] args){

			//chiedo la grandezza dell'array
			Scanner s = new Scanner(System.in);
			System.out.println("Inserire la dimensione dell'array");
			int n = s.nextInt();
			
			//dichiaro e creo un array di n interi
			int [] a = new int[n];
			
			//dichiaro e creo un array di n boolean
			boolean [] b = new boolean[n];
			
			int r=0; //variabile in cui salvo momentaneamnete i valori
			int count = 0; //contatore che mi conta i numeri pari
			/**
			 * GENERO n NUMERI CASUALI E SALVO NELL'ARRAY b SE SONO 
			 * PARI (true) O DISPARI (false)
			 * */
			for (int i=0; i<n; i++){
				r = (int) ( Math.random( ) * 10);
				a[i] = r;
				//controllo se r è pari [modulo della la divisione per 2 è 0]
				if( (r%2) == 0){
					b[i]=true; //pari
					count++;//incremento il contatore
				}
				else{
					b[i]=false; //dispari
				}
			}
			
			/**
			 * CREO L'ARRAY c IN CUI SALVO SOLO I NUMERI PARI
			 * LA DIMENSIONE SARÀ count
			 * */			
			 int [] c = new int[count];
			 int j=0; //indice per scorrere c
			 
			 /* scorro l'array b, se l'elemento attuale è true
			  * prendo l'elemento di a con tale indice e lo salvo in c
			  * */
			for (int i=0; i<n; i++){
				if( b[i]==true) {
					c[j]=a[i];
					j++;
				}
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
			
			//stampo l'array c
			System.out.println("\n\n");
			System.out.print("ARRAY C: "); 			
			for (int i=0; i<count; i++){
				//stampa elemento
				System.out.print(" [" + c[i] + "]"); 
			}
		}
		

}
