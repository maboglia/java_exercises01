// Tipo char
class Caratteri{
	public static void main(String args[]){
		char c1,c2,c3;
		// Inizializza c1 al carattere 97, vale a dire 'a'
		c1 = 97;
		c2 = 'a';
		c3= 'z';
		System.out.println("c1 vale " + c1);
		System.out.println("c2 vale " + c2);
		System.out.println("c3 vale " + c3);
		/* Restituisce in output il carattere corrispondente
		al codice Unicode di c1 */
		System.out.println(c1);
                /* Incrementa di una unita' il codice
		del carattere Unicode */
		c1 = ++c1;
		System.out.println(c1);
	}
}
