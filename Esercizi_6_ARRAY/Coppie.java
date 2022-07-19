import java.util.*;

public class Coppie{
	public static void main(String [] args){

			//chiedo la grandezza dell'array
			Scanner s = new Scanner(System.in);
			System.out.println("Inserire la dimensione dell'array");
			int n = s.nextInt();
			
			//dichiaro e creo un array di n interi
			int [] a = new int[n];
			
			//chiedo gli n numeri da inserire nell'array
			for (int i=0; i<n; i++){
				System.out.println("Inserire l'elemento "+i);
				a[i]=s.nextInt();
			}
			
			/***
			CONTROLLO SE C'E' ALMENO UNA COPPIA DI NUMERI UGUALI
			***/
			
			//durante il for lo imposto a ture se trovo una coppia
			boolean flag = false;
			
			/* Ciclo che scorre l'array. Per ogni elemento devo 
			 * controllare se ce n'è uno uguale più avanti,
			 * se lo trovo esco
			 */
			etichetta_exit:
			for (int i=0; i<n; i++){
				
					for (int j=i+1; j<n; j++){
						
							if(a[i]==a[j]){
								flag = true;
								break etichetta_exit;
							}
						
					}
				
			}
			
			if(flag){
				System.out.println("Esiste almeno una coppia");
			}
			else{
				System.out.println("Non esistono coppie");
			}
		}
		

}

