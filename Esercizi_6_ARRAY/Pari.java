import java.util.*;

public class Pari{
	public static void main(String [] args){

			//chiedo la grandezza dell'array
			Scanner s = new Scanner(System.in);
			System.out.println("Inserire la dimensione dell'array");
			int n = s.nextInt();
			
			//dichiaro e creo un array di n interi
			int [] a = new int[n];
			
			int r=0; //variabile in cui salvo momentaneamnete i valori
			
			//genero n numeri casuali e li salvo nell'array
			for (int i=0; i<n; i++){
				r = (int) ( Math.random( ) * 10);
				a[i] = r;
			}
			

			/***
			* SOMMO I NUMERI DI POSIZIONE PARI
			***/
			int sum = 0; //variabile in cui memorizzo la somma

			for (int i=0; i<n; i=i+2){
				//calcolo la somma
				sum=sum+a[i];

			}

			//stampo l'array
			for (int i=0; i<n; i++){
				//stampa elemento
				System.out.println(" [" + a[i] + "]"); 
			}
			
			//stampo la somma
			System.out.println("La somma è: " + sum);
		}
		

}
