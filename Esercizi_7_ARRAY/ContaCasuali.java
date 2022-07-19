import java.util.*;

public class ContaCasuali{
	public static void main(String [] args){

			
			Scanner s = new Scanner(System.in);

			//numero massimo rappresentabile (range)
			int r = 10;
			
			//chiedo quanti numeri casuali voglio generare
			System.out.println("Quanti numeri casuali vuoi generare? (numero grande)");
			int n_cas = s.nextInt();

			//dichiaro e creo un array di r interi che conterrà un contatore per ogni numero
			int [] a = new int[r];
			
			int rnd=0; //variabile in cui salvo momentaneamnete i valori

			//inizializzo tutti i valori dell'array a 0
			for (int i=0; i<r; i++){
				a[i] = 0;
			}
			
			//genero n numeri casuali
			for (int i=0; i<n_cas; i++){
				rnd = (int) ( Math.random( ) * r);
				a[rnd] = a[rnd]+1;
			}
			
			/***
			* STAMPO L'ARRAY DELLE FREQUENZE
			**/
			for (int i=0; i<r; i++){
				//stampa elemento
				System.out.println("Frequenza di uscita del numero " +i+ " = "+a[i]); 
			}
			

		}
		

}
