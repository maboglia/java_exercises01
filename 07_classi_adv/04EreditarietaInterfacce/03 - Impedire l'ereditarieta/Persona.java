/* Programma che contiene la definizione
   della classe Persona */
public final class Persona{
	String nome;
	String cognome;
	
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