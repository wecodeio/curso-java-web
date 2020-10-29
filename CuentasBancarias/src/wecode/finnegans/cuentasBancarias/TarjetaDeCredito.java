package wecode.finnegans.cuentasBancarias;

public class TarjetaDeCredito {

	private Cuenta cuenta;
	private double total;
	private double limite;
	
	public TarjetaDeCredito(Cuenta cuenta, double limite) {
		super();
		this.cuenta = cuenta;
		this.limite = limite;
		this.total = 0;
	}
	
	// comprar sumos los montos
	public boolean comprar(double monto) {
		if (this.total + monto <= this.limite) {
			this.total += monto;
			return true;
		}
		return false;
	}
	
	// cobrar total + 3%
	public void cobrar() {
		this.cuenta.retirarDinero(this.total * 1.03);
		this.total = 0;
	}
	
}
