/* Operatori logici di cortocircuito.
   Variante del listato NoCortoCircuito.java */
class CortoCircuito{
	public static void main(String args[]){
                int i = 5, j = 2, k = 0;
		boolean b1;
                // i e' maggiore di j e quindi b1 e' true
		b1 = (i > j) || (i > (j / k));
		System.out.println(b1);
	}
}
