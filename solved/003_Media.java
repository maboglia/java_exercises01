/*calcola la media aritmetica di un array di interi*/
public class Media {
	public static void main(String[] args){
		int[] arrays = new int[]{1, 1, 5, -3};
		double res = calcola(arrays);
		System.out.println(res);
	}
	static double calcola(int[] a){
		double m = 0;
	    for(int i = 0; i < a.length; i++){
	       m = m + a[i];
	    }
	    return m/a.length;
	}
}
