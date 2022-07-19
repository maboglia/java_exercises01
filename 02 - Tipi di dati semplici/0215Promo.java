/* Espressione con operandi di tipo diverso.
   Variante del listato PromoErrata.java */
class Promo{
	public static void main(String args[]){
		byte b1=10, b2;
		b2 = (byte)(b1 * 5);
		System.out.println(b2);
	}
}