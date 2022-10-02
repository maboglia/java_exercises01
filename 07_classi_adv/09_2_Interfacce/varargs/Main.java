package it.bogliaccino.varargs;

public class Main {

	public static void main(String[] args) {
		
		System.out.println(calcola_media(2, 4, 8, 18, 16, 45, 97));

	}

	public static int calcola_media(int... i) {
		
		int totale = 0;
			
			for ( int x : i )
				totale += x;
		
		return totale / i.length;
	}

}
