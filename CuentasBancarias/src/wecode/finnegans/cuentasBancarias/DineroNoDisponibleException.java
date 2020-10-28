package wecode.finnegans.cuentasBancarias;

public class DineroNoDisponibleException extends Exception {
	public DineroNoDisponibleException(String mensaje) {
		super(mensaje);
		
	}
}
