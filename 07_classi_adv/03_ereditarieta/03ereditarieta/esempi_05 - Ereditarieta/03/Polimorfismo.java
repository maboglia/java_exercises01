public class Polimorfismo{
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
}	