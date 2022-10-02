abstract class Figura {
	protected String nome;
	protected char c;
	abstract public void ridimensiona(double scala);
	abstract public void disegna();

	public Figura(String nome, char c) {
		this.nome = nome;
		this.c = c;
	}
	
	public Figura(String nome) {
		this.nome = nome;
		this.c = '#';
	}
}
