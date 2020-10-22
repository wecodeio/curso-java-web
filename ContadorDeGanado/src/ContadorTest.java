import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ContadorTest {

	private static final int MUCHO = Integer.MAX_VALUE;
	private Contador c;
	
	@Before
	public void setup() {
		this.c = new Contador();
	}
	
	@Test
	public void queMuestraCuandoAunNoConto() {
		assertEquals(0, c.mostrar());
	}
	
	@Test
	public void queCuenta() {
		assertEquals(0, c.mostrar()); // 0 == c.mostrar()
		c.contar();
		assertEquals(1, c.mostrar());
	}
	
	@Test
	public void queReinicia() {
		c.contar();
		assertNotEquals(0, c.mostrar()); // 0 != c.mostrar()
		c.reiniciar();
		assertEquals(0, c.mostrar());
	}
	
	@Test
	public void queCuentaMucho() {
		for (int i = 0; i < MUCHO; i++) {
			c.contar();
		}
		assertEquals(MUCHO, c.mostrar());
	}
}
