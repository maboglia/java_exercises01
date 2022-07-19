// Generazione di un errore di perdita di precisione
class PromoErrata{
	public static void main(String args[]){
		byte b1=10, b2;
		// b2 riceve 50, ma genera un errore di compilazione
		b2 = b1 * 5;
		System.out.println(b2);
	}
}