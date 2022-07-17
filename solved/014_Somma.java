public class Somma {
	public static void main(String[] args){
		int[] arrays = new int[]{1, 1, 3, -3};
		int res = totale(arrays);
		System.out.println(res);
	}
	static int totale(int[] a){
		int tot = 0;
		for(int i = 0; i <a.length-1; i++){
			if(a[i] < 0){
		           return tot;
		       }
			tot = tot +a[i];
		}
		return tot;
	}
}