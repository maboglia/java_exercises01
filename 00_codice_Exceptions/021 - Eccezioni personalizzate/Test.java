public class Test {
	
	public static void test(int a) throws MiaEccezione{
		if(a==0) throw new MiaEccezione();
	}
	
	public static void main(String[] args){
		try{
			// Non lancia eccezioni
			test(1);
			// Lancia un'eccezione di tipo MiaEccezione
			test(0);
		}catch (MiaEccezione e){
			System.out.println(e.dettagli());
		}
	}
}