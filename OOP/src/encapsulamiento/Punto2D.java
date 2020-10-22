package encapsulamiento;

public class Punto2D {
	
	private double x;
	private double y;
	
	public Punto2D(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public Punto2D() {
		this(0,0);
	}
	
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	

}
