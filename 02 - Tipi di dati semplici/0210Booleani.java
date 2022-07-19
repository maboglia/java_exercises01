// Operatori logici booleani
class Booleani{
	public static void main(String args[]){
		boolean b1,b2,b3;
		// b1 vale false
		b1 = 3 > 5;
		// b2 vale true
		b2 = 1 < 10;
		b3 = b1 & b2;
                System.out.println("L'affermazione \" 3 > 5 e 1 < 10 \" risulta " + b3);
		b3 = b1 | b2;
		System.out.println("L'affermazione \" 3 > 5 o 1 < 10 \" risulta " + b3);
		b3 = b1 ^ b2;
		System.out.println("L'affermazione \" o 3 > 5 o 1 < 10 \" risulta " + b3);
		b1 = 2 < 10;
		b3 = b1 ^ b2;
		// Attenzione alla sequenza \"
		System.out.println("L'affermazione \" o 2 < 10 o 1 < 10 \" risulta " + b3);
	}
}
