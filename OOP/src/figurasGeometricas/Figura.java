package figurasGeometricas;

public abstract class Figura implements Movible, Comparable<Figura> {
	
	private Punto ubicacion;
	private String color;
	
	public Figura(Punto ubi, String color) {
		this.color=color;
		this.ubicacion=ubi;
	}
	
	public abstract Double getArea();
	
	public String getColor() {
		return this.color;
	}
	
	public Punto getUbicacion() {
		return ubicacion;
	}
	
//	public int compareTo(Figura otraFigura) {
//		if(this.getArea() < otraFigura.getArea())
//			return -1;
//		if(this.getArea() > otraFigura.getArea())
//			return 1;
//		return 0;
//	}
	
	public int compareTo(Figura otraFigura) {
		return this.getColor().compareTo(otraFigura.getColor());
		
	}
	
	
	
	

}
