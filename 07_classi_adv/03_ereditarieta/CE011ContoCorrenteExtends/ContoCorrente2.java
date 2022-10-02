package giorno1;

public class ContoCorrente2 extends ContoCorrente {

	public ContoCorrente2() {
		super();
	}
	
	public ContoCorrente2(double ammontare) {
		super(ammontare);
	}
	
	public void prelievoControllato(double ammontare) throws Exception {
		if (getSaldo() - ammontare <0) {
			throw new Exception("Non ci sono abbastanza fondi sul conto");
		}
		prelievo(ammontare);
		
	}

	/* (non-Javadoc)
	 * @see giorno1.ContoCorrente#calcolaInteresse(double)
	 */
	@Override
	public void calcolaInteresse(double tasso) {
		// TODO Auto-generated method stub
		System.out.println("hai chiamato il metodo di conto2");
		double incrementa = tasso * 1.5;
		super.calcolaInteresse(incrementa);
	}
	
	
}
