// Array multidimensionale
class Pitagora{
	public static void main(String args[]){
		int prodotto[][] = new int[4][];
		int i,j;
		for(i = 0; i < 4; i++)
			prodotto[i] = new int[i + 1];
		for(i = 0; i < 4; i++)
			for(j = 0; j <= i; j++)
				prodotto[i][j] = (i + 1) * (j + 1);
		System.out.println(prodotto[0][0]);
		for(i = 0; i < 2; i++) System.out.print(prodotto[1][i] + " ");
		System.out.println();
		for(i = 0; i < 3; i++) System.out.print(prodotto[2][i]+" ");
		System.out.println();
		for(i = 0; i < 4; i++) System.out.print(prodotto[3][i]+" ");
		System.out.println();
	}
}