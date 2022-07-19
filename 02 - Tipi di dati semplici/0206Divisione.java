// Divisioni tra variabili intere e variabili decimali
class Divisione{
	public static void main(String args[]){
		int i1 = 6, i2 = 5, i3 = 3, i4;
		float f1 = 6, f2 = 5, f3 = 3, f4;
		i4 = i1 / i2;
		System.out.println(i1 + "/" + i2 + " vale " + i4);
		i4 = i1 / i3;
		System.out.println(i1 + "/" + i3 + " vale " + i4);
		i4 = i2 / i3;
		System.out.println(i2 + "/" + i3 + " vale " + i4);
		f4 = f1 / f2;
		System.out.println(f1 + "/" + f2 + " vale " + f4);
		f4 = f1 / f3;
		System.out.println(f1 + "/" + f3 + " vale " + f4);
		f4 = f2 / f3;
		System.out.println(f2 + "/" + f3 + " vale " + f4);
		System.out.println(f1 / f2);
	}
}