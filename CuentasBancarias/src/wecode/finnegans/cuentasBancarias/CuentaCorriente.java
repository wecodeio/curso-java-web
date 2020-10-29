package wecode.finnegans.cuentasBancarias;

public class CuentaCorriente extends Cuenta {
	private Double descubierto;
	
	public CuentaCorriente(Double descubierto) {
		super();
		this.descubierto = descubierto;
	}

	@Override
	public Double obtenerSaldoDisponible() {
		return this.obtenerSaldo() + this.descubierto;
	}
	
}
