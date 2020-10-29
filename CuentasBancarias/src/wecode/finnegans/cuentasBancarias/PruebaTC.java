package wecode.finnegans.cuentasBancarias;

public class PruebaTC {

	public static void main(String[] args) {
		
		CuentaDeAhorros c = new CuentaDeAhorros();
		c.agregarDinero(1000);
		
		
		TarjetaDeCredito tarjeta = new TarjetaDeCredito(c, 500);
		
		System.out.println(tarjeta.comprar(100));
		System.out.println(tarjeta.comprar(200));
		System.out.println(tarjeta.comprar(300));
		
		tarjeta.cobrar();
		c.mostrarMovimientos(); // 309 pesos
		
		
	}
	
}
