************************************************
L'ereditarieta'
************************************************
01 - Sottocartella 01 -> Scatola.java
02 - Sottocartella 01 -> ScatolaPesante.java
03 - Sottocartella 01 -> UsoScatole.java
04 - Sottocartella 02 -> Scatola.java
05 - Sottocartella 02 -> ScatolaPesante.java
06 - Sottocartella 02 -> ScatolaTara.java
07 - Sottocartella 03 -> Triangolo.java
08 - Sottocartella 03 -> Triangolo3D.java
09 - Sottocartella 03 -> Polimorfismo.java
10 - Sottocartella 04 -> FiguraGeometrica.java
************************************************

// Utilizzo di super per risolvere conflitti di nome
class ScatolaTara extends ScatolaPesante{
	double peso;
	ScatolaTara(double alt, double prof, double largh, double pes, double tara){
		super(alt, prof, largh, pes);
		peso = tara;
	}
	double pesoNetto(){
		return super.peso-peso;
	}
}// Utilizzo di super() nei costruttori
class ScatolaPesante extends Scatola{
	double peso;
	ScatolaPesante(double alt, double prof, double largh, double pes){
		super(alt,prof,largh);
		peso = pes;
	}
	public double pesoSpecifico(){
		return peso / volume();
	}
	public double superficie(){
		return 2 *(altezza * larghezza + altezza * profondita + larghezza * profondita);
	}
}// La classe Scatola con il costruttore
class Scatola{
	double altezza, profondita, larghezza;
	Scatola(double alt, double prof, double largh){
		altezza = alt;
		profondita = prof;
		larghezza = largh;
	}
	public double volume(){
		return altezza * profondita * larghezza;
	}
}public class Triangolo3D extends Triangolo{
	private double z1;
	private double z2;
	private double z3;
	public Triangolo3D(double x1, double y1, double z1,double x2,
	double y2, double z2, double x3, double y3, double z3){
		/* in primo luogo viene richiamato il costruttore
		della superclasse */
		super(x1, y1, x2, y2, x3, y3);
		/* e necessario utilizzare this, poiche
		le variabili di istanza sono mascherate
		dai parametri del costruttore */
		this.z1 = z1;
		this.z2 = z2;
		this.z3 = z3;
	}
	public double distanza(double x1, double y1, double z1, double x2, double y2, double z2){
		/* per calcolare la distanza si utilizza il calcolo
		della distanza tra due punti del piano definito
		nella superclasse */
		return Math.sqrt(Math.pow(super.distanza(x1, y1, x2, y2), 2) + Math.pow(z1 - z2, 2));
	}
	public double perimetro(){
		double dist=0;
		/* le variabili di istanza della superclasse sono
		private e quindi bisogna ricorrere agli appositi
		metodi che restituiscono il loro valore */
		dist += distanza(x1(), y1(), z1, x2(), y2(), z2);
		dist += distanza(x1(), y1(), z1, x3(), y3(), z3);
		dist += distanza(x2(), y2(), z2, x3(), y3(), z3);
		return dist;
	}
	public void trasla(double dx, double dy, double dz){
		/*si sfrutta il metodo pubblico della superclasse
		per traslare lungo le coordinate X e Y e quindi
		si trasla lungo l'asse Z */
		super.trasla(dx,dy);
		z1 += dz;
		z2 += dz;
		z3 += dz;
	}
	/* poiche le variabili di istanza sono private
	i metodi che seguono consentono al codice esterno
	alla classe di accedere ai loro valori */
	double z1(){
		return this.z1;
	}
	double z2(){
		return this.z2;
	}
	double z3(){
		return this.z3;
	}
}public class Polimorfismo{
	// Crea una nuova istanza di Polimorfismo
	public Polimorfismo(){
	}
	public static void main(String[] args){
		Triangolo t;
		Triangolo3D t3 = new Triangolo3D(0, 0, 0, 3, 4, 0, 0, 0, 12);
		/* il perimetro viene calcolato dal codice
		della sottoclasse */
		System.out.println("Il perimetro del triangolo e " + t3.perimetro());
		/* si assegna a una variabile di tipo
		della superclasse un riferimento all'oggetto */
		t = t3;
		/* si calcola il perimetro tramite una variabile
		di tipo della superclasse */
		System.out.println("Il perimetro del triangolo e " + t.perimetro());
	}
}	class Triangolo{
	private double x1,y1, x2, y2, x3, y3;
	public Triangolo(double x1,double y1,double x2,double y2, double x3, double y3){
		boolean b;
		// Se b e true almeno due vertici sono coincidenti
		b = distanza(x1, y1, x2, y2) == 0;
		b = b || (distanza(x1, y1, x3, y3) == 0);
		b = b || (distanza(x2, y2, x3, y3) == 0);
		if(!b){
			this.x1 = x1;
			this.x2 = x2;
			this.x3 = x3;
			this.y1 = y1;
			this.y2 = y2;
			this.y3 = y3;
		}
	}
	public void trasla(double dx,double dy){
		x1 += dx;
		x2 += dx;
		x3 += dx;
		y1 += dy;
		y2 += dy;
		y3 += dy;
	}
	public double perimetro(){
		double dist = 0;
		dist += distanza(x1, y1, x2, y2);
		dist += distanza(x1, y1, x3, y3);
		dist += distanza(x2, y2, x3, y3);
		return dist;
	}
	public double distanza(double x1, double y1, double x2, double y2){
		double dx=x1-x2, dy=y1-y2;
		/* restituisce al chiamante il risultato
		dell'espressione */
		return Math.sqrt(dx * dx + dy * dy);
	}
	public double x1(){
		return x1;
	}
	public double y1(){
		return y1;
	}
	public double x2(){
		return x2;
	}
	public double y2(){
		return y2;
	}
	public double x3(){
		return x3;
	}
	public double y3(){
		return y3;
	}
}abstract class FiguraGeometrica{
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
}// Utilizzo delle classi Scatola e ScatolaPesante
class UsoScatole{
	public static void main(String args[]){
		Scatola scat;
		ScatolaPesante scatPes = new ScatolaPesante();
		System.out.println("Proprieta della scatola:");
		/* Utilizzo di variabili di istanza ereditate
		dalla classe Scatola */
		scatPes.altezza = 3;
		scatPes.larghezza = 4;
		scatPes.profondita = 5;
		// Utilizzo delle variabili di istanza proprie
		scatPes.peso = 30;
		/* Utilizzo del metodo ereditato
		dalla classe Scatola */
		System.out.println("volume: " + scatPes.volume());
		// Utilizzo dei propri metodi
		System.out.println("superficie: " + scatPes.superficie());
		System.out.println("peso specifico: " + scatPes.pesoSpecifico());
		// Assegnazione del riferimento alla variabile scat
		scat = scatPes;
		/* Questo e' possibile perche' un oggetto di tipo
		ScatolaPesante e' anche un oggetto di tipo Scatola.
		Tramite la variabile scat di tipo Scatola si puo'
		accedere solo alle proprieta' e ai metodi definiti
		nella classe Scatola */
		System.out.println("Accesso tramite variabile di tipo Scatola");
		// utilizzo dei metodi della classe scatola
		System.out.println("volume: " + scat.volume());
		// la riga seguente e' commentata perche errata
		/* System.out.println("peso specifico: " + scat.peso Specifico()); */
	}
}// Definizione della classe ScatolaPesante
class ScatolaPesante extends Scatola{
	double peso;
	public double pesoSpecifico(){
		return peso / volume();
	}
	public double superficie(){
		return 2 * (altezza * larghezza + altezza * profondita + larghezza * profondita);
	}
}// Definizione della classe Scatola
class Scatola{
	double altezza, profondita, larghezza;
	public double volume(){
		return altezza * profondita * larghezza;
	}
}
