/* Programma contenente la classe Studente,
   che eredita da Persona */
public class Studente extends Persona{
	
	String matricola;
	
	public Studente(String nome, String cognome, String matricola){
		super(nome,cognome);
		this.matricola = matricola;
	}
	
	public String getMatricola(){
		return matricola;
	}
}