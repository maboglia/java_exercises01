
public class TuttiUguali {

	public static void main(String[] args) {

		int[] valori = { 5, 5, 5, 5, 5, 5, 5, 5, 5, 5};
		
		boolean ok = true;
		for (int x : valori) {
			if (x!=valori[0]) ok=false;
		}
		
		if (ok) System.out.println("tutti uguali");
		else System.out.println("non tutti uguali");
		
	}

}
