import java.io.Serializable;

// questa classe associa un nome a una età
// implmenta Serializable per poter essere salvata su file
public class NomeEta implements Serializable {
	
	// variabile statica richiesta da Serializable
	static final long serialVersionUID = 1;

	// variabili nome e eta, private!
	private String nome;
	private int eta;
	
	// costruttore
	NomeEta(String nome, int eta) {
		this.nome = nome;
		this.eta = eta;
	}
	
	// restituisce il nome
	public String getNome(){
		return nome;
	}

	// restituisce l'eta'
	public int getEta(){
		return eta;
	}
	
	// incrementa l'eta' di uno
	public void incrementaEta() {
		eta++;
	}

	// rappresenta come una stringa
	public String toString() {
		return nome + " " + eta;
	}
	
}
