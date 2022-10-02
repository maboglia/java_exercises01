// Definizione della classe ScatolaPesante
class ScatolaPesante extends Scatola{
	double peso;
	public double pesoSpecifico(){
		return peso / volume();
	}
	public double superficie(){
		return 2 * (altezza * larghezza + altezza * profondità + larghezza * profondità);
	}
}