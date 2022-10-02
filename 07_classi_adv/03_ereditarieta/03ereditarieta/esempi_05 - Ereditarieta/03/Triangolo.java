class Triangolo{
	private double x1,y1, x2, y2, x3, y3;
	public Triangolo(double x1,double y1,double x2,double y2, double x3, double y3){
		boolean b;
		// Se b e true almeno due vertici sono coincidenti
		b = distanza(x1, y1, x2, y2) == 0;
		b = b || (distanza(x1, y1, x3, y3) == 0);
		b = b || (distanza(x2, y2, x3, y3) == 0);
		if(!b){
			this.x1 = x1;
			this.x2 = x2;
			this.x3 = x3;
			this.y1 = y1;
			this.y2 = y2;
			this.y3 = y3;
		}
	}
	public void trasla(double dx,double dy){
		x1 += dx;
		x2 += dx;
		x3 += dx;
		y1 += dy;
		y2 += dy;
		y3 += dy;
	}
	public double perimetro(){
		double dist = 0;
		dist += distanza(x1, y1, x2, y2);
		dist += distanza(x1, y1, x3, y3);
		dist += distanza(x2, y2, x3, y3);
		return dist;
	}
	public double distanza(double x1, double y1, double x2, double y2){
		double dx=x1-x2, dy=y1-y2;
		/* restituisce al chiamante il risultato
		dell'espressione */
		return Math.sqrt(dx * dx + dy * dy);
	}
	public double x1(){
		return x1;
	}
	public double y1(){
		return y1;
	}
	public double x2(){
		return x2;
	}
	public double y2(){
		return y2;
	}
	public double x3(){
		return x3;
	}
	public double y3(){
		return y3;
	}
}