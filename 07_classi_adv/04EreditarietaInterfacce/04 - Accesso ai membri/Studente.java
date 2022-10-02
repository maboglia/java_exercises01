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
	
	/* La seguente porzione di codice genera
	   errore
	public void stampaInformazioni(){
		System.out.println(nome);
		System.out.println(cognome);
		System.out.println(matricola);
	} */
	
	/* La seguente porzione di codice
	   e' corretta */
	public void stampaInformazioni(){
		System.out.println(getNome());
		System.out.println(getCognome());
		System.out.println(matricola);
	}
}