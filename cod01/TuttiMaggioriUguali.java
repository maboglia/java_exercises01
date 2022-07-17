
public class TuttiMaggioriUguali {

	public static void main(String[] args) {

		int[] valori = { 5, 5, 25, 65, 5, 8, 8, 5, 5, 5};
		
		boolean ok = true;
		for (int x : valori) {
			if (x<valori[0]) ok=false;
		}
		
		if (ok) System.out.println("tutti maggiori o uguali");
		else System.out.println("NO");
		
	}

}
