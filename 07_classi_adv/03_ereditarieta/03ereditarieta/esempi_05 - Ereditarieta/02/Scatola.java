// La classe Scatola con il costruttore
class Scatola{
	double altezza, profonditÓ, larghezza;
	Scatola(double alt, double prof, double largh){
		altezza = alt;
		profonditÓ = prof;
		larghezza = largh;
	}
	public double volume(){
		return altezza * profonditÓ * larghezza;
	}
}