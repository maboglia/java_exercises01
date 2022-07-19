import java.util.*;

public class StrChar{
	public static void main(String [] args){

			//chiedo una parola in input
			Scanner s = new Scanner(System.in);
			System.out.println("Inserire una parola");
			String parola = s.next();
			
			//calcolo la lunghezza della parola:
			int n = parola.length();
			
			//dichiaro e creo un array di n stringhe
			String [] a = new String[n];
			
			//prendo le singola lettere della parola e le salvo nell'array
			for (int i=0; i<n; i++){
				a[i]=parola.substring(i,i+1);
			}

			//stampo la parola
			System.out.println("PAROLA: " + parola);
			
			//stampo l'array
			System.out.print("ARRAY: ");
			for (int i=0; i<n; i++){
				System.out.print(" [ " + a[i] + " ] ");
			}			
		}
		

}
