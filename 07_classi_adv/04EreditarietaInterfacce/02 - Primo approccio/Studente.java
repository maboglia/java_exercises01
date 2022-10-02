/* Programma contenente la classe Studente,
   che eredita da Persona */
public class Studente extends Persona{
	
	String matricola;
	
	public void setMatricola(String matricola){
		this.matricola = matricola;
	}
	
	public String getMatricola(){
		return matricola;
	}
}