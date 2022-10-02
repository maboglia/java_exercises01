public class Triangolo3D extends Triangolo{
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
}