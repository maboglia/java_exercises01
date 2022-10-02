public class EsProva {

  public static void main(String[] args) {
  	
  	
//    try {
//      throw new Exception("Messaggio!!!");
//    } catch (Exception e) {
//      // TODO Auto-generated catch block
//      e.printStackTrace();
//    }
  	
  	int r=0;
  	try {
      r = dividi(4,0);
    } catch (DivisionePerZeroException e) {
    	System.out.println("Errore: " + e.getMessage());
    	e.printStackTrace();
    	//r = 0;
    } catch(Exception e){
    }
    
    System.out.println("r= " + r);
  	
  }
  
  public static int dividi(int a, int b) throws DivisionePerZeroException {
  	if(b==0){
  		throw new DivisionePerZeroException("divisione per zero");
  	}
  	
  	return a / b;
  }
}
