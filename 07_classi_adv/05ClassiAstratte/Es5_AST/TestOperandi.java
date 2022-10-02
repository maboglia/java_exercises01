import junit.framework.TestCase;


public class TestOperandi extends TestCase {

	public TestOperandi(String arg0) {
		super(arg0);
	}
	
	public void testCostante(){
		
		Costante c = new Costante(3);
		
		assertEquals(3,c.valuta());
		
	}
	
	public void testVariabile(){
		
		Variabile v = new Variabile(1);
		
		assertEquals(1,v.valuta());
		
		v.assegna(2);
		
		assertEquals(2,v.valuta());
	}
	
	public void testOperandi(){
		
		Costante c = new Costante(3);
		
		Variabile v = new Variabile(2);
		
		Operando op1 = c;
		
		Operando op2 = v;
		
		assertEquals(3,op1.valuta());
		assertEquals(2,op2.valuta());
	}
	
	public void testEsempio(){
		
		Espressione e = 
			new Prodotto(
				new Costante(3),
				new Somma(
					new Variabile(1),
					new Costante(2)));
		
		assertEquals(9,e.valuta());
	}

}
