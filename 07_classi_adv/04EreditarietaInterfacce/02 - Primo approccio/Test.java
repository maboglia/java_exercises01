public class Test{
	
	public static void main(String[] args){
		StudenteIngegneria s = new StudenteIngegneria();
		s.setNome("Mauro");
		s.setCognome("Bogliaccino");
		s.setMatricola("123456");
		s.setTipo("Informatica");
		System.out.println("Nome: " + s.getNome());
		System.out.println("Cognome: " + s.getCognome());
		System.out.println("Matricola: " + s.getMatricola());
		System.out.println("Ingegneria " + s.getTipo());				
	}
}