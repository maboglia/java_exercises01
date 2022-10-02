public class Rettangolo extends Figura {
	
	private int altezza, larghezza;
	
	public Rettangolo(String nome, char c, int larghezza, int altezza) {
		super(nome, c);
		this.altezza = altezza;
		this.larghezza = larghezza;
	}
	
	public Rettangolo(String nome, int larghezza, int altezza) {
		super(nome, 'c');
		this.altezza = altezza;
		this.larghezza = larghezza;
	}
	
	public void ridimensiona(double scala) {
		altezza *= scala;
		larghezza *= scala;
	}
	
	public void disegna() {
		for(int i = 0; i < altezza; ++i) {
			for(int j = 0; j < larghezza; ++j) {
				System.out.print(c);
			}
			System.out.print("\n");
		}
	}
	
	public int getAltezza() {
		return altezza;
	}
	
	public int getLarghezza() {
		return larghezza;
	}
	
	@Override
	public String toString() {
		String ss;
		if(altezza == larghezza)
			ss = new String("Nome: " + nome + " Carattere: " + c + " Lato: " + altezza);
		else {
			ss = new String("Nome: " + nome + " Carattere: " + c + " Altezza: " + altezza + " Larghezza: " + larghezza);
		}
		return ss;
	}
	
	@Override 
	public boolean equals(Object obj) {
		if (getClass() == obj.getClass()) {
			Rettangolo r = (Rettangolo)obj;
			if( this.altezza == r.getAltezza()  && this.larghezza == r.getLarghezza())
				return true;
			else 
				return false;
		}
		return false;
	}
}
