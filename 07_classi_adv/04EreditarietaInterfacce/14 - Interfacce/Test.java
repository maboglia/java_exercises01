public class Test{
	public static void main(String[] args) {
		Animale a1 = new Gatto();
		Animale a2 = new Cane();
		Animale a3 = new Topo();
		System.out.println("- Gatto	- - - - - - - -");
		a1.faiVerso();
		a1.dimmiCiboPreferito();
		System.out.println("- Cane	- - - - - - - -");
		a2.faiVerso();
		a2.dimmiCiboPreferito();
		System.out.println("- Topo	- - - - - - - -");
		a3.faiVerso();
		a3.dimmiCiboPreferito();		
	}
}