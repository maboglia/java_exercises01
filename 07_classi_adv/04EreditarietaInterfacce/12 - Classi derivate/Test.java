public class Test {
	public static void main(String[] args){
		A a1 = new A();
		A a2 = new B();
		A a3 = new C();		
	System.out.println("a1 instanceof A: " + (a1 instanceof A));
	System.out.println("a1 instanceof B: " + (a1 instanceof B));
	System.out.println("a1 instanceof C: " + (a1 instanceof C));
	System.out.println("a2 instanceof A: " + (a2 instanceof A));
	System.out.println("a2 instanceof B: " + (a2 instanceof B));
	System.out.println("a2 instanceof C: " + (a2 instanceof C));
	System.out.println("a3 instanceof A: " + (a3 instanceof A));
	System.out.println("a3 instanceof B: " + (a3 instanceof B));
	System.out.println("a3 instanceof C: " + (a3 instanceof C));
	}
}