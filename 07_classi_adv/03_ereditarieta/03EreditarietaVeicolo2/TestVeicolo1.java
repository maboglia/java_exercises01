/* 
   La classe testa le classi Veicolo1, Auto1, Camion1 e Moto1, mostrando
   un esempio del polimorfismo.
*/

public class TestVeicolo1 {

    public static void main(String[] arg) {
	// definisco 7 veicoli usando gli array:
	Veicolo1[] parcoMacchine = new Veicolo1[] {
	    new Auto1(123, "Ada", "Sport"),
	    new Auto1(345, "Ugo", "Familiare"),
	    new Camion1(567, "Mario", 4),
	    new Moto1(102, "Ido", 2),
	    new Auto1(456, "Franco", "Utilitaria"),
	    new Camion1(876, "Max", 3),
	    new Moto1(451, "Lia", 1)
	};

	// adesso la variabile parcoMacchine e' un array le cui
	// entrate si riferiscono ad oggetti di tipo Auto1, Camion1 o
	// Moto1.

	// Stampo il parco macchine, usando il polimorfismo (che 
	// e' evidenziato dalla chiamata del metodo disegna());

	for (int i = 0; i < parcoMacchine.length; i++) {
	    System.out.print("numero matricola: ");
	    System.out.println(parcoMacchine[i].dammiMatricola());
	    System.out.print("nome proprietario: "); 
	    System.out.println(parcoMacchine[i].dammiProprietario());
	    System.out.print("disegno del mezzo: ");
	    System.out.println(parcoMacchine[i].disegna());
	    System.out.println();
	}
    }
}
