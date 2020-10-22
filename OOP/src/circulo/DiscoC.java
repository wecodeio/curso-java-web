package circulo;

public class DiscoC {

	private Circulo circuloGrande;
	private Circulo agujero;

	public DiscoC(double r1 , double r2) {
		if(r1>r2) {
			this.circuloGrande = new Circulo(r1);
			this.agujero = new Circulo(r2);
		}
		else
		{
			this.circuloGrande = new Circulo(r2);
			this.agujero = new Circulo(r1);
		}

	}

	public double getPerimetroInterior() {
		return this.agujero.getPerimetro();
	}

	public double getPerimetroExterior() {
		return this.circuloGrande.getPerimetro();

	}

	public double getSuperficie() {
		return this.circuloGrande.getSuperficie()-this.agujero.getSuperficie();
	}

	public void setRadioInterior(double ri) {
		if(ri>this.circuloGrande.getRadio()) {
			this.agujero = new Circulo(ri);
			this.circuloGrande = new Circulo(this.circuloGrande.getRadio());
 		}
		else
		{
			this.agujero.setRadio(ri);
		}
		
	}
	
	public void setRadioExterior(double re) {
		if(re<this.agujero.getRadio()) {
			this.circuloGrande.setRadio(this.agujero.getRadio());
			this.agujero.setRadio(re);
		}
		else
		{
			this.circuloGrande.setRadio(re);
		}
	}
	
		
	public static void main(String[] args) {

		DiscoC disquito = new DiscoC(4.0,6.0);
		System.out.println(disquito.getPerimetroInterior());
		System.out.println(disquito.getPerimetroExterior());
		System.out.println(disquito.getSuperficie());

		DiscoC otroDisco = new DiscoC(6.0,4.0);
		System.out.println(otroDisco.getPerimetroInterior());
		System.out.println(otroDisco.getPerimetroExterior());
		System.out.println(otroDisco.getSuperficie());
		
		otroDisco.setRadioExterior(3.0);
		System.out.println(otroDisco.getPerimetroInterior());
		System.out.println(otroDisco.getPerimetroExterior());
		System.out.println(otroDisco.getSuperficie());
		
	}
	
	


}
