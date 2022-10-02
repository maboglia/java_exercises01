public class Utente {

	// memorizza nome, username e password di un utente (impiegato bancario)
	// come variabili d'istanza
	private String realname;
	private String username;
	private String password;
	
	// inizializza le variabili d'istanza
	public Utente(String nome, String user, String pwd) {
		realname = nome;
		username = user;
		password = pwd;
	}
	
	// controlla se le credenziali ricevute corrispondono a quelle dell'utente
	public boolean controlla(String user, String pwd) {
		return (username.equals(user) && password.equals(pwd));
	}
	
	// fornisce il nome completo dell'utente
	public String ottieniNome() {
		return realname;
	}
	
}
