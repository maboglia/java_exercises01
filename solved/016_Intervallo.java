
public class Intervallo {
	public static void main(String[] args){
		int a = 5;
		int b = 1;
		int res = somma(a, b);
		System.out.println(res);
	}
	static int somma(int a, int b){
		int totale = 0;
	    if(a > b){
	        for (int i = b; i <= a; i++){
	        	totale = totale + i;
	        }
	        return totale;
	    }else {
	        for (int i = a; i <= b; i++){
	        	totale = totale + i;
	        }
	        return totale;
	    }
	}
}
