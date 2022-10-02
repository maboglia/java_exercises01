import junit.framework.TestCase;



public class TestDividi extends TestCase {

  public TestDividi(String arg0) {
    super(arg0);
  }
  
  public void testNormale() throws DivisionePerZeroException {
  	int a = 4;
  	int b = 2;
  	
  	int r=0;
    try {
      r = EsProva.dividi(a, 0);
      assertTrue(true); //ok
    } catch (DivisionePerZeroException e) {
    	fail("dividi() fallito inaspettatamente");
    }
  	// in alternativa
//	r = Prova.dividi(a, 0);
	
  	assertEquals("Risultato errato",2,r);
  }
  
  public void testDivZero(){
		int a = 4;
		int b = 0;
  	
		int r=0;
		try {
			r = EsProva.dividi(a, b);
			fail("dividi() sarebbe dovuto fallire");
		} catch (DivisionePerZeroException e) {
			assertTrue(true); //ok
		}
  }

}
