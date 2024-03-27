package studio7;

public class Fraction {
	private int num;
	private int dem;
	
	
	public Fraction(int n, int d) {
		num = n;
		dem = d;

	}
	public double makeFraction() {
		double Frac = num/dem;
		return Frac;
	}
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getDem() {
		return dem;
	}
	public void setDem(int dem) {
		this.dem = dem;
	}
	public Fraction addFrac(Fraction Frac2) {
		/*double firstF = makeFraction();
		double secF = Frac2.makeFraction();*/
		Fraction sum = new Fraction(1,1);
		if(dem == Frac2.getDem()) {
			sum.setDem(dem);
			sum.setNum(num + Frac2.getNum());
		}else {
			
		}
		
		return sum;
		
	}
	
}
		
	

