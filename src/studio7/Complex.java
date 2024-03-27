package studio7;

public class Complex {
	private double a;
	private double b;
	
	public Complex(double aA, double bB) {
		a = aA; //non imaginary
		b = bB; //imaginary
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
	
	public Complex addC(Complex complex2) {
		double aSum = complex2.getA() + a;
		double bSum = complex2.getB() + b;
		Complex sum =  new Complex(aSum, bSum);
		return sum;
	}
	public Complex multC(Complex complex2) {
		double a2 = complex2.getA();
		double b2 = complex2.getB();
		
		double aProduct = (a*a2)-(b*b2);
		double bProduct = (a*b2)+(b*a2);
		
		Complex product = new Complex(aProduct, bProduct);
		return product;
	}
	
	public static void main(String[] args) {
		Complex z = new Complex(5,3);
		Complex y = new Complex(3,6);
		System.out.println()
	}
}
