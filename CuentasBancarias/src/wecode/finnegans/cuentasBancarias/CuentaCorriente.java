package wecode.finnegans.cuentasBancarias;

public class CuentaCorriente extends Cuenta {
	private Double descubierto;
	
	public CuentaCorriente(Double descubierto) {
		super();
		this.descubierto = descubierto;
	}

	
	@Override
	public Double retirarDinero(Double platita) {
		try {
			if(platita > 0 && platita <= super.obtenerSaldo() + this.descubierto ) {
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
