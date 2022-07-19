import java.util.*;

public class PariForzato{
	public static void main(String [] args){

			//chiedo la grandezza dell'array
			Scanner s = new Scanner(System.in);
			System.out.println("Inserire la dimensione dell'array");
			int n = s.nextInt();
			
			//dichiaro e creo un array di n interi
			int [] a = new int[n];

			int mom = 0; //variabile per salvare momentaneamente l'input
			
			//chiedo gli n numeri da inserire nell'array
			for (int i=0; i<n; i++){
				while(true)
				{
					System.out.println("Inserire l'elemento "+i);
					mom=s.nextInt();
					
					//controllo se il numero è pari
					if( (mom%2)==0 ){
						a[i]=mom;//lo inserisco nell'array
						break; //esco dal while
					}						
				}

			}
			
			//stampo l'array
			System.out.print("ARRAY: "); 
			for (int i=0; i<n; i++){
				//stampa elemento
				System.out.print(" [" + a[i] + "]"); 
			}
			
	}
		

}
