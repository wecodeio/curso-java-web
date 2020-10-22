package circulo;
public class CirculoDos implements Movible{
	
	private Double radio;
	private Punto puntoDeAplicacion;

	public CirculoDos(double radio , Punto pda) {
		setRadio(radio);
		setPuntoDeAplicacion(pda);
	}
	
	public void mover(double deltaX, double deltaY) {
		this.puntoDeAplicacion.mover(deltaX, deltaY);
	}
	
	public Punto getPuntoDeAplicacion() {
		return puntoDeAplicacion;
	}
	
	public Punto getUbicacion() {
		return this.getPuntoDeAplicacion();
	}

	public void setPuntoDeAplicacion(Punto puntoDeAplicacion) {
		this.puntoDeAplicacion = puntoDeAplicacion;
	}

	public Double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	public Double getDiametro() {
		return this.getRadio() * 2;
	}
	
	public Double getPerimetro() {
		return this.getDiametro() * Math.PI;
	}
	
	public Double getSuperficie() {
		return Math.pow(this.getRadio(), 2) * Math.PI;
	}
	
	public static void main(String[] args) {
		
		CirculoDos circulito = new CirculoDos(1, new Punto(5,-4));
		
		System.out.println(circulito.getDiametro());
		System.out.println(circulito.getPerimetro());
		System.out.println(circulito.getSuperficie());
		circulito.mover(-1, 8);
		System.out.println(circulito.getUbicacion());
	}
	

}
