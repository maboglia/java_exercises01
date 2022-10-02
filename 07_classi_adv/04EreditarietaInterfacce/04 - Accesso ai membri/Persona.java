/* Programma che contiene la definizione
   della classe Persona */
public class Persona{
	private String nome;
	private String cognome;
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public void setCognome(String cognome){
		this.cognome = cognome;
	}
	
	public String getNome(){
		return nome;
	}
	
	public String getCognome(){
		return cognome;
	}
}