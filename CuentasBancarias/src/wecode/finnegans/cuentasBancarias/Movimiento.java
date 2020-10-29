package wecode.finnegans.cuentasBancarias;

public class Movimiento {

	private String tipo;
	private double monto;
	
	public Movimiento(String tipo, double monto) {
		super();
		this.tipo = tipo;
		this.monto = monto;
	}
	
	@Override
	public String toString() {
		return this.tipo + " -> $ " + this.monto;
	}
	
}
