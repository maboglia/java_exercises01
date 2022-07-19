// Operatori di confronto
class Confronti{
	public static void main(String args[]){
		boolean b1, b2;
		int i1 = 3, i2 = 6;
		char c1 = 'a', c2 = 'b';
                b1 = i1 >= i2; // e' falso
		System.out.println(i1 + ">=" + i2 + " restituisce " + b1);
                b2 = c1 < c2; // e' vero
		System.out.println(c1 + "<=" + c2 + " restituisce " + b2);
		System.out.print(b1 + "!=" + b2 + " restituisce ");
                // visualizza vero, poiche' b1 e' falso e b2 e' vero
		System.out.println(b1 != b2);
	}
}
