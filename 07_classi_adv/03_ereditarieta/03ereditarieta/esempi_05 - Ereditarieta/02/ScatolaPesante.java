// Utilizzo di super() nei costruttori
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
		return 2 *(altezza * larghezza + altezza * profondità + larghezza * profondità);
	}
}