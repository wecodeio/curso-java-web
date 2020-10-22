package figurasGeometricas;

public class Circulo extends Elipse {
	
	public Circulo(Punto c, String color, double radio) {
		super(c,color,radio,radio);
	}
	
	public String getColor() {
		return super.getColor();
	}
}
