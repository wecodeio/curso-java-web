package wecode.finnegans.cuentasBancarias;

public class CuentaDeAhorros extends Cuenta {
	private Double saldoReserva = 0.0;
	
	public void reservarSaldo(Double platita) {
		if(super.obtenerSaldo() >= platita) {
			this.saldoReserva += this.retirarDinero(platita);
		}
	}
	
	public Double getSaldoReserva() {
		return saldoReserva;
	}

	public void reintegrarReserva() {
		super.agregarDinero(this.saldoReserva);
		this.saldoReserva=0.0;
	}
	
	
	
	@Override
	public Double retirarDinero(Double platita) {
		try {
			if(platita >0 && super.obtenerSaldo() >= platita) {
				super.setSaldo(super.obtenerSaldo() - platita);
				return platita;
			} 
			else throw new DineroNoDisponibleException("No dispone de dinero suficiente para realizar la operación solicitada");
		
		} catch (DineroNoDisponibleException dnd) {
			System.err.println(dnd.getMessage());
			return 0.0;
		}
				
	}

}
