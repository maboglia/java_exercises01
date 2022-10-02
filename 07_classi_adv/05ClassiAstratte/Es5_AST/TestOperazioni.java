import junit.framework.TestCase;

public class TestOperazioni extends TestCase {

	public void testEspressione1(){
		Espressione e;
		// costruisco l'espressione...
		
		Costante tre = new Costante(3);
		Variabile x = new Variabile(1);
		Costante due = new Costante(2);
		
		Somma piu = new Somma(x,due);
		Prodotto per = new Prodotto(tre,piu);
		
		e = per;
		
		int valore = e.valuta();
		
		assertEquals(9,valore);
		
		x.assegna(2);
		
		valore = e.valuta();
		
		assertEquals(12,valore);
		
	}
	
	public void testStampa(){
		Espressione e;
		// costruisco l'espressione...
		
		Costante tre = new Costante(3);
		Variabile x = new Variabile("x",1);
		Costante due = new Costante(2);
		
		Somma piu = new Somma(x,due);
		Prodotto per = new Prodotto(tre,piu);
		
		e = per;
		
		String espressione = e.stampa();
		
		assertEquals("(3*(x+2))",espressione);
	}
}
