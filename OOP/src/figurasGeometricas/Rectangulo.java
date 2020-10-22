package figurasGeometricas;

public class Rectangulo extends Figura {
	
	private Punto p2;
	
	public Rectangulo(Punto p1, String color, Punto p2) {
		super(p1,color);
		this.p2=p2;
	}

	@Override
	public void mover(double deltaX, double deltaY) {
		super.getUbicacion().mover(deltaX, deltaY);
		this.p2.mover(deltaX, deltaY);
	}

	@Override
	public Double getArea() {
		double base =Math.abs(super.getUbicacion().getX()-this.p2.getX());
		double altura=Math.abs(super.getUbicacion().getY()-this.p2.getY());
		return base * altura;
	}

}
