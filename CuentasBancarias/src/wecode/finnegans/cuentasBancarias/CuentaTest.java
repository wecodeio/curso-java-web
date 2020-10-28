package wecode.finnegans.cuentasBancarias;

public class CuentaTest {

	public static void main(String[] args) {
		CuentaDeAhorros miCuenta = new CuentaDeAhorros();
		CuentaCorriente cuentaDestino = new CuentaCorriente(500.0);
		cuentaDestino.agregarDinero(1000.0);
		cuentaDestino.retirarDinero(1250.0);
		System.out.println(cuentaDestino.obtenerSaldo());
		cuentaDestino.retirarDinero(250.0);
		System.out.println(cuentaDestino.obtenerSaldo());
		miCuenta.agregarDinero(2000);
		miCuenta.transferir(1500.0, cuentaDestino);
		System.out.println(miCuenta.obtenerSaldo());
		System.out.println(cuentaDestino.obtenerSaldo());
		
	}

}
