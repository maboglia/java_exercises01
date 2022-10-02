abstract class FiguraGeometrica{
	String nome;
	double altezza;
	double base;
	// dichiarazione del metodo astratto
	abstract double area();
	// dichiarazione di un metodo non astratto
	void stampaNome(){
		System.out.println("Figura geometrica: " + nome);
	}
}
class Quadrato extends FiguraGeometrica{
	Quadrato(double lato){
		altezza = base = lato;
		nome="Quadrato";
	}
	double area(){
		return base * altezza;
	}
}
class Triangolo extends FiguraGeometrica{
	Triangolo(double base, double altezza){
		super.altezza = altezza;
		super.base = base;
		nome = "Triangolo";
	}
	double area(){
		return base * altezza / 2;
	}
}
class UsoFigura{
	public static void main(String args[]){
		Triangolo t = new Triangolo(3,4);
		t.stampaNome();
		System.out.println("Area: " + t.area());
		Quadrato q = new Quadrato(3);
		q.stampaNome();
		System.out.println("Area: " + q.area());
		FiguraGeometrica a;
		/* assegnazione ad a di una variabile
		di un suo sottotipo */
		a = q;
		a.stampaNome();
		System.out.println("Area: " + a.area());
		/* la riga seguente genererebbe un errore
		di compilazione */
		// a = new FiguraGeometrica();
	}
}