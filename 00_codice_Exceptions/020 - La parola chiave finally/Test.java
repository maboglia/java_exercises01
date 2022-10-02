public class Test{
	
	public static void test(){
		try{
				System.out.println("Dentro try esterno");
				try{
						System.out.println("Dentro try interno");
						throw new Exception();
				}catch(ArithmeticException e){
						System.out.println("Dentro catch interno");
				}finally{
						System.out.println("Dentro finally interno");
				}
		}catch(Exception e){
				System.out.println("Dentro catch esterno");
		}finally{
				System.out.println("Dentro finally esterno");
		}
	}
	
	public static void main(String[] args){
		test();
	}
}