package circulo;

public class Circulo {

	private double radio;
	
	public Circulo(double radio) {
		this.radio = radio;
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
	
}
