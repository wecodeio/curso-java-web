package monedero;
/*Defina una clase 'Monedero' que permita gestionar la cantidad de dinero de que una persona dispone en un momento dado. 
La clase deberá tener un constructor que permitirá crear un monedero con una cantidad de dinero inicial y 
deberá definir un método para meter dinero en el monedero, otro para sacarlo y finalmente, 
otro para consultar el disponible; solo podrá conocerse la cantidad de dinero del monedero
a través de este último método. 
Por supuesto, no se podrá sacar más dinero del que haya en un momento dado en el monedero. 

Implementar un juego de pruebas unitarias para probar el correcto funcionamiento del Monedero. 
*/

public class Monedero {
	
	private double monto;
	
	public Monedero(double platita) {
		this.setMonto(platita);
	}
		
	public Monedero() {
		this(0);		
	}
	
	@Override
	public String toString() {
		return "Monedero [monto=" + monto + "]";
	}

	public double obtenerSaldo() {
		return this.getMonto();
	}
	
	public void ponerDinero(double platita) {
		this.setMonto(this.getMonto() + platita);
	}
	
	public double sacarDinero(double platita) {
		if(this.getMonto()>=platita) {
			this.setMonto(this.getMonto() - platita);
			return platita;
		}
		double aux = this.getMonto();
		this.setMonto(0);
		return platita-aux;
	}

	private double getMonto() {
		return monto;
	}

	private void setMonto(double monto) {
		if(monto>=0)
			this.monto = monto;
	}
	
	

}
