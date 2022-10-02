public class Test{
	
	public static int dividi(int a, int b) throws Exception {
		int c = a/b;
		return c;
	}
	
	public static void main(String[] args){
		try{
			
				int risultato = dividi(5,0);
				System.out.println(risultato);
		}catch (Exception e){
				System.out.println("Impossibile dividere");
		}
	}
}