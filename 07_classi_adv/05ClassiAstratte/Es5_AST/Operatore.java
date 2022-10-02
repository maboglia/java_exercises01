
public abstract class Operatore extends Espressione {
 
	Espressione primo;
	Espressione secondo;
	
	Operatore(Espressione a, Espressione b){
		primo = a;
		secondo = b;
	}
}
