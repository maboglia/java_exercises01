// La classe Scatola con il costruttore
class Scatola{
	double altezza, profondit�, larghezza;
	Scatola(double alt, double prof, double largh){
		altezza = alt;
		profondit� = prof;
		larghezza = largh;
	}
	public double volume(){
		return altezza * profondit� * larghezza;
	}
}