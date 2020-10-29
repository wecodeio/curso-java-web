package wecode.finnegans.cuentasBancarias;

import java.util.LinkedList;

public abstract class Cuenta  {
	
	private double saldo = 0;
	protected LinkedList<Movimiento> movimientos = new LinkedList<Movimiento>(); 

	public void agregarDinero(double platita) {
		if(platita > 0) {
			this.setSaldo(this.saldo + platita);
			this.movimientos.add(new Movimiento("DEPOSITO", platita));
		}
	}

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
	
	public Double obtenerSaldoDisponible() {
		return this.obtenerSaldo();
	}

	@Deprecated
	public void mostrarMovimientos() {
		for (Movimiento movimiento : movimientos) {
			System.out.println(movimiento);
		}
	}

	public Double retirarDinero(Double platita) {
		try {
			if(platita > 0 && this.obtenerSaldoDisponible() >= platita ) {
				this.setSaldo(this.obtenerSaldo() - platita);
				this.movimientos.add(new Movimiento("EXTRACCION", -platita));
				return platita;
			} 
			else throw new DineroNoDisponibleException("No dispone de dinero suficiente para realizar la operación solicitada");
		
		} catch (DineroNoDisponibleException dnd) {
			System.err.println(dnd.getMessage());
			return 0.0;
		}
	}
}
