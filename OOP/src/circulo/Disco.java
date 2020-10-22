package circulo;

public class Disco implements Movible {
	
	private Double radioInterior;
	private Double radioExterior;
	
	public Disco(Double r1, Double r2) {
		if(r1 > r2 ) {
			this.radioInterior = r2;
			this.radioExterior = r1;
		}
		else {
			this.radioInterior = r1;
			this.radioExterior = r2;
		}
	}
	
	public double getPerimetroInterior() {
		return this.getRadioInterior() * 2 * Math.PI;
	}
	
	public double getPerimetroExterior() {
		return this.getRadioExterior() * 2 * Math.PI;
	}
	
	public double getSuperficie() {
		double superficieGrande = Math.pow(this.getRadioExterior(),2)*Math.PI;
		double superficieAgujero = Math.pow(this.getRadioInterior(),2)*Math.PI;
		return superficieGrande - superficieAgujero;
	}
	
	@Override
	public void mover(double deltaX, double deltaY) {
		
		
	}
	
		
	public Double getRadioInterior() {
		return radioInterior;
	}

	public void setRadioInterior(Double radioInterior) {
		this.radioInterior = radioInterior;
	}

	public Double getRadioExterior() {
		return radioExterior;
	}

	public void setRadioExterior(Double radioExterior) {
		this.radioExterior = radioExterior;
	}
	
	public static void main(String[] args) {
		
		Disco disquito = new Disco(4.0,6.0);
		System.out.println(disquito.getPerimetroInterior());
		System.out.println(disquito.getPerimetroExterior());
		System.out.println(disquito.getSuperficie());
		
		Disco otroDisco = new Disco(6.0,4.0);
		System.out.println(otroDisco.getPerimetroInterior());
		System.out.println(otroDisco.getPerimetroExterior());
		System.out.println(otroDisco.getSuperficie());
		
	}

	

}
