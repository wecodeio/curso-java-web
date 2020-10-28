package wecode.finnegans.cuentasBancarias;

public abstract class Cuenta  {
	private double saldo = 0;

	
	public void agregarDinero(double platita) {
		if(platita > 0)
			this.setSaldo(this.saldo + platita);
	}

	public abstract Double retirarDinero(Double platita);
	
		
	public void transferir(Double importeATransferir, Cuenta cuentaDestino) {
		if(this.retirarDinero(importeATransferir).equals(importeATransferir)) {
			cuentaDestino.agregarDinero(importeATransferir);
		}
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Double obtenerSaldo() {
		return this.saldo;
	}


}
