// Array monodimensionale
class Sveglia{
	public static void main(String args[]){
		// dichiarazione array
		int ora[];
		//allocazione memoria per l'array
		ora = new int[7];
		//assegnazione di valori all'array
		ora[0] = 10;
		ora[1] = 7;
		ora[2] = 8;
		ora[3] = 7;
		ora[4] = 9;
		ora[5] = 8;
		ora[6] = 10;
		//dichiarazione di una variabile per il ciclo for
		int i;
		for(i = 0; i < 7; i++)
			System.out.println("il giorno " + i + " la sveglia suona alle " + ora[i]);
	}
}