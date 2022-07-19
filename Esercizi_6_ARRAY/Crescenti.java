import java.util.*;

public class Crescenti{
	public static void main(String [] args){

			//chiedo la grandezza dell'array
			Scanner s = new Scanner(System.in);
			System.out.println("Inserire la dimensione dell'array");
			int n = s.nextInt();
			
			//dichiaro e creo un array di n interi
			int [] a = new int[n];
			
			//genero chiedo gli n numeri da inserire nell'array
			for (int i=0; i<n; i++){
				System.out.println("Inserire l'elemento "+i);
				a[i]=s.nextInt();
			}
			
			/***
			CONTROLLO SE I NUMERI SONO CRESCENTI
			***/
			
			//durante il for lo imposto a false se non sono crescenti
			boolean flag = true;
			
			/* Dato che all'interno del for farò riferimento all'emento
			 * a[i+1] il ciclo lo faccio arrivare fino a n-1 e non n.
			 * Appena riscontro che non sono crescenti esco
			 */
			for (int i=0; i<n-1; i++){
				
				if(a[i]>a[i+1]){
					flag = false;
					break;
				}
			}
			
			if(flag){
				System.out.println("Gli elementi sono in ordine crescente");
			}
			else{
				System.out.println("Gli elementi non sono in ordine crescente");
			}
		}
		

}
