public class Test {
	
	public static void main(String[] args){
		Animale[] zoo = new Animale[3];
		zoo[0] = new Gatto();
		zoo[1] = new Cane();
		zoo[2] = new Topo();
		for(int i = 0; i < zoo.length; i++)
			zoo[i].faiVerso();
	}
}