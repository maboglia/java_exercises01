package it.bogliaccino.mostri;

public class CheOrrore {

	public static void main(String[] args) {
		
		Drago ivandrago = new Drago("ivandrago");
		Vampiro vampirla = new Vampiro("darcula");
		Troll troll = new Troll("quella carezza della sera");
		
		
		ivandrago.distruggi();
		vampirla.spaventa();
		vampirla.uccidi();
		troll.spaventa();

	}

}
