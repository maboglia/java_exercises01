
public class Polymorphism {

	public static void main(String[] args) {
		
		Quotidiano q  = new Quotidiano("Buongiorno","2005","Gramellini","La Stampa","Ottobre","12");
		
		Rivista q_come_rivista = q;
		
		Pubblicazione q_come_pubb = q;

		
		Rivista r = new Rivista("Rubrica","2005","Pippo","Panorama","Settembre");
		stampa(r);
		stampa(q);
	}

	private static void stampa(Pubblicazione pubb) {
		pubb.print();
	}
}
