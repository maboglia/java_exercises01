import java.util.*;

public class Massimo{
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
				r = (int) ( Math.random( ) * 1000);
				a[i] = r;
			}
			
			/***
			STAMPO L'ARRAY E INTANTO CERCO IL MASSIMO
			***/
			int max = 0; //variabile in cui memorizzo il massimo
			int ind = 0; //variabile in cui memorizzo l'indice del massimo

			for (int i=0; i<n; i++){
				//calcolo del massimo
				if(max<a[i]){
					max=a[i];
					ind=i;
				}
				//stampa elemento
				System.out.println(" [" + a[i] + "]"); 
			}
			
			System.out.println("Il massimo e' "+max+ " nella posizione " + ind);
		}
		

}
