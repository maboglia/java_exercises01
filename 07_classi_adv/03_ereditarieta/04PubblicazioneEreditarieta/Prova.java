
public class Prova {

  public static void main(String[] args) {
  	
  	Pubblicazione[] pubs = new Pubblicazione[10];
  	
  	pubs[0] = new Pubblicazione("T","A","Au");
	pubs[1] = new Libro("T","A","Au","E");
	// un riferimento a Pubblicazione puo' puntare
	// ad un oggetto Libro (di classe derivata)
	
	for (int i = 0; i < pubs.length; i++) {
		if(pubs[i]!=null)
		pubs[i].print();
	}
	
	Pubblicazione p = pubs[1];
	
	Libro l = (Libro)pubs[0];
	
	//l = (Libro)(new String("L"));
  }
}
