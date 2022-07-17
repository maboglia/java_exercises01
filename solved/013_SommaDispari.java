
public class SommaDispari {
	public static void main(String[] args){
		int num = 5;
		int res = totale(num);
		System.out.println(res);
	}
	static int totale(int a){
		int tot = 0;
	    for(int i = 0; i < (a*2); i++){
	        if((i%2) != 0){
	        	tot = tot + i;
	        } 
	    }
	    return tot;
	}
}
