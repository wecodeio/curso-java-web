package wecode.finnegans.cuentasBancarias;

public class CuentaTest {

	public static void main(String[] args) {
		Cuenta miCuenta = new Cuenta();
		Cuenta cuentaDestino = new Cuenta();
		System.out.println(miCuenta.obtenerSaldo());
		miCuenta.agregarDinero(1000);
		System.out.println(miCuenta.obtenerSaldo());
		miCuenta.retirarDinero(1550);
		System.out.println(miCuenta.obtenerSaldo());
		miCuenta.transferir(1000, cuentaDestino);
		System.out.println(miCuenta.obtenerSaldo());
		System.out.println(cuentaDestino.obtenerSaldo());
	}

}
