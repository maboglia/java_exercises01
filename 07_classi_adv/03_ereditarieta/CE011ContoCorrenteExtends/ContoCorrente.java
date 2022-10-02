package giorno1;

public class ContoCorrente {

	private double saldo;
	
	public ContoCorrente() {

		this.saldo=0;

	}
	public ContoCorrente(double ammontare) {
		
		this.saldo=ammontare;
		
	}
	
	public void versamento(double ammontare) {

		//this.saldo = this.saldo + ammontare;
		this.saldo += ammontare;

	}
	
	
	public void prelievo(double ammontare) throws Exception {
		
		//this.saldo = this.saldo + ammontare;
		
		if (this.saldo - ammontare <0) {
			throw new Exception("Non ci sono abbastanza fondi sul conto");
		}
		this.saldo -= ammontare;
		
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void calcolaInteresse(double tasso) {
		System.out.println("hai chiamato il metodo di conto1");
		
		this.saldo = this.saldo + (this.saldo * (tasso /100.0) );

	}
}
