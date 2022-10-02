package giorno1;

public class ContoTester {

	public static void main(String[] args) {


		ContoCorrente elena = new ContoCorrente();
		try {
			elena.prelievo(50);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		elena.versamento(100);
		elena.versamento(100);
		System.out.println(elena.getSaldo());
		elena.calcolaInteresse(5);
		System.out.println(elena.getSaldo());
		
		ContoCorrente2 mauro = new ContoCorrente2(50);
		
		mauro.calcolaInteresse(15);
		try {
			mauro.prelievoControllato(100);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		mauro.calcolaInteresse(6);
		System.out.println(mauro.getSaldo());
		

	}

}
