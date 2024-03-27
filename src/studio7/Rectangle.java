package studio7;

import edu.princeton.cs.introcs.StdDraw;

public class Rectangle {
	private double x;
	private double y;
	private double halfWidth;
	private double halfHeight;
	
	public Rectangle(double initx, double inity, double initHalfWidth, double initHalfHeight) {
		x = initx;
		y = inity;
		halfWidth = initHalfWidth;
		halfHeight = initHalfHeight;
		
	}
	
	public double perimeter() {
		double perimeter = 4*this.halfWidth + 4*this.halfHeight;
		System.out.println(perimeter);
		return perimeter;
	}
	public double area() {
		double area = (2*this.halfWidth) * (2*this.halfHeight);
		System.out.println(area);
		return area;
	}
	public void rectangleDraw() {
		StdDraw.rectangle(this.x, this.y, this.halfWidth, this.halfHeight);
	}
	
	public double comparison(Rectangle r) {
		double thisArea = area();
		double thatArea = r.area();
		if(thisArea > thatArea) {
			return thisArea;
		}else {
			return thatArea;
		}
	}
	public boolean isSquare() {
		if(this.halfWidth == this.halfHeight) {
			return true;
		}else {
			return false;
		}
	}


public static void main(String[] args) {
	Rectangle r = new Rectangle(0,0,0.5,0.2);
	Rectangle r2 = new Rectangle(0,0,0.5,0.4);
	System.out.println(r.perimeter());
	System.out.println(r.area());
	r.rectangleDraw();
	System.out.println(r.comparison(r2));
	System.out.println(r.isSquare());
}

}