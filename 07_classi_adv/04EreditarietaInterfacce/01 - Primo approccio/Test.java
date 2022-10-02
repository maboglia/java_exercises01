public class Test{
	
	public static void main(String[] args){
		Studente s = new Studente();
		s.setNome("Mauro");
		s.setCognome("Bogliaccino");
		s.setMatricola("123456");
		System.out.println("Nome: " + s.getNome());
		System.out.println("Cognome: " + s.getCognome());
		System.out.println("Matricola: " + s.getMatricola());		
	}
}