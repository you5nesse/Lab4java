package Complexe;

public class Complexe {

	private double a;
	private double b;

	public Complexe(double a, double b) {
		this.a = a;
		this.b = b;
	}

	

	public double getA() {
		return a;
	}



	public void setA(double a) {
		this.a = a;
	}



	public double getB() {
		return b;
	}



	public void setB(double b) {
		this.b = b;
	}



	public Complexe plus(Complexe C) {
		return new Complexe(this.a + C.a, this.b + C.b);
	}

	public Complexe moins(Complexe C) {

		return new Complexe(this.a - C.a, this.b - C.b);
	}

	@Override
	public String toString() {
		return "[" + a + " , " + b + "]";
	}
	
}
