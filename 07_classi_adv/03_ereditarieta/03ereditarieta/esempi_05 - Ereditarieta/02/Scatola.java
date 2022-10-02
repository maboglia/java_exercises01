// La classe Scatola con il costruttore
class Scatola{
	double altezza, profondità, larghezza;
	Scatola(double alt, double prof, double largh){
		altezza = alt;
		profondità = prof;
		larghezza = largh;
	}
	public double volume(){
		return altezza * profondità * larghezza;
	}
}