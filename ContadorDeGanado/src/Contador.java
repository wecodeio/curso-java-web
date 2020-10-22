public class Contador {

	// atributos
	private int valor;

	// métodos
	public void contar() {
		this.valor++;
	}

	public int mostrar() {
		return this.valor;
	}

	public void reiniciar() {
		this.valor = 0;
	}
}
