public class Test2{
	
	public static void main(String[] args){
		
		A[] a = new A[3];
		a[0] = new A();
		a[1] = new B();
		a[2] = new C();	
		for(int i = 0; i < a.length; i++)
			a[i].prova();	
	}
}