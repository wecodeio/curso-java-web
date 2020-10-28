package wecode.finnegans.cuentasBancarias;

public class Cuenta {
	private double saldo;

	private Cuenta(double dinero) {
		this.setSaldo(dinero);
	}

	public Cuenta() {
		this(0);
	}

	public void agregarDinero(double platita) {
		if(platita > 0)
			this.setSaldo(this.saldo + platita);
	}

	public double retirarDinero(double platita) {
		try {
			if(platita >0 && this.saldo >= platita) {
				this.setSaldo(this.saldo - platita);
				return platita;
			}
			else throw new DineroNoDisponibleException("No dispone de dinero suficiente para realizar la operación solicitada");
		
		} catch (DineroNoDisponibleException dnd) {
			System.err.println(dnd.getMessage());
			return 0;
		}
				
	}
		
	public void transferir(double importeATransferir, Cuenta cuentaDestino) {
		if(importeATransferir > 0 ) {
			cuentaDestino.agregarDinero(this.retirarDinero(importeATransferir));
		}
	}

	private void setSaldo(double saldo) {
		if(saldo >= 0)
			this.saldo = saldo;
		else this.saldo = 0;
	}

	public double obtenerSaldo() {
		return this.saldo;
	}


}
