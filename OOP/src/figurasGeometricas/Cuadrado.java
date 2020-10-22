package figurasGeometricas;

public class Cuadrado extends Rectangulo {
	
	public Cuadrado(Punto p1,String color, double lado) {
		super(p1, color, new Punto(p1.getX()+lado,p1.getY()+lado));
	}
	
	

}
