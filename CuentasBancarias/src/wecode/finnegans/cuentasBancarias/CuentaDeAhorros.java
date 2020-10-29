package wecode.finnegans.cuentasBancarias;

public class CuentaDeAhorros extends Cuenta {
	private Double saldoReserva = 0.0;

	public void reservarSaldo(Double platita) {
		if (this.obtenerSaldo() >= platita) {
			this.saldoReserva += this.retirarDinero(platita);
		}
	}

	public Double getSaldoReserva() {
		return saldoReserva;
	}

	public void reintegrarReserva() {
		this.agregarDinero(this.saldoReserva);
		this.saldoReserva = 0.0;
	}
	
}
