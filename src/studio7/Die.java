package studio7;

public class Die {
	private int n;
	public Die(int range) {
		n=range;
	}
	
	public int Roll() {
		int randomNum = (int) (Math.random()*n+1);
		return randomNum;
	}
	


public static void main(String[] args) {
	Die a = new Die(19);
	System.out.println(a.Roll());
	
}
}