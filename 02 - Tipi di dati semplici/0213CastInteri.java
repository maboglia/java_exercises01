// Cast da int a byte
class CastInteri{
	public static void main(String args[]){
		int i1 = 10, i2 = 257, i3 = 513;
		byte b1,b2,b3;
		b1 = (byte)i1;
		b2 = (byte)i2;
		b3 = (byte)i3;
		System.out.println("Esempi di cast da int a byte");
		System.out.println("Il cast di " + i1 + " vale " + b1);
		System.out.println("Il cast di " + i2 + " vale " + b2);
		System.out.println("Il cast di " + i3 + " vale " + b3);
	}
}