package monedero;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MonederoTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void constuctorTest() {
		Monedero miMonedero=new Monedero();
		double esperado = 0;
		double actual = miMonedero.obtenerSaldo();
		assertEquals(actual, esperado, 0.001);
	}
	
	@Test
	public void constuctorDeMenosTest() {
		Monedero miMonedero=new Monedero(-100);
		double esperado = 0;
		double actual = miMonedero.obtenerSaldo();
		assertEquals(actual, esperado, 0.001);
	}
	
	@Test
	public void ponerDineroDesdeVacioTest() {
		Monedero miMonedero=new Monedero();
		miMonedero.ponerDinero(50.30);
		double esperado=50.30;
		double actual=miMonedero.obtenerSaldo();
		assertEquals(esperado,actual,0.001);
		
	}
	@Test
	public void ponerDineroTest() {
		Monedero miMonedero=new Monedero(50);
		miMonedero.ponerDinero(100);
		double esperado=150;
		double actual=miMonedero.obtenerSaldo();
		assertEquals(esperado,actual,0.01);
			
	}
	@Test
	public void sacarDineroTest() {
		Monedero miMonedero=new Monedero(50);
		miMonedero.sacarDinero(100);
		double esperado=0;
		double actual=miMonedero.obtenerSaldo();
		assertEquals(esperado,actual,0.01);
	
	}
	@Test
	public void sacarMasDineroTest() {
		Monedero miMonedero=new Monedero(20);
		double esperado=20;
		double actual=miMonedero.sacarDinero(100);
		assertEquals(esperado,actual,0.01);
	
	}
	

}
