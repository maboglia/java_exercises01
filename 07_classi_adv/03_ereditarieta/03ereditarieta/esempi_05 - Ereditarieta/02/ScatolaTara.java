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
}