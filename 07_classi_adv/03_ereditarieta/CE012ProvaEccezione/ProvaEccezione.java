package giorno1;

public class ProvaEccezione {

	public static void main(String[] args) {

		
		
		//scorriArray();
		
		
			
			try {
				int divisione = calcola(5,1);
				if (divisione == 5) {
				 throw new MiaEccezione();
				}
			} catch (MiaEccezione e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
				System.out.println(e.maggioriDettagli());
			}
		
			
			try {
				divisione(5,0);
			} catch (MiaEccezione e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			} finally {
				System.out.println("sono una istruzione eseguita in ogni caso");
			}
		
		System.out.println("ciao");

	}

	private static int divisione(int a,int b) throws MiaEccezione {
		int c= a/b;
		return c;
	}

	private static void scorriArray() {
		try {
			int[] numeri = {12,22,36,54,89};
			
			int lunghezza = numeri.length;
			
			for (int i = 0; i<=lunghezza; i++) {
				System.out.println(numeri[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static int calcola(int a, int b) {
		int c=0;
		
		try {
			
			 c = a/b;
			
			//System.out.println(c);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}	
			
		return c;
	}

}
