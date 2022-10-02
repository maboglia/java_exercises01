public class Test {
	
	public static void main(String[] args){
		try {
				throw new Exception("Sono un'eccezione lanciata manualmente");
			}catch(Exception e){
				System.out.println("Ho catturato un'eccezione");
				System.out.println("Messaggio: " + e.getMessage());
			}	
	}
}