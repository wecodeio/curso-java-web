package wecode.finnegans.cuentasBancarias;

import java.util.LinkedList;
import java.util.List;

public class PruebaPlata {

	public static void main(String[] args) {
		List<Dinero> plata = new LinkedList<Dinero>();
		
		plata.add(new Dinero("USD", 5));
		plata.add(new Dinero("USD", 5));
		plata.add(new Dinero("USD", 5));
		plata.add(new Dinero("ARS", 5000));
		
		
		total;
		for (Dinero dinero : plata) {
			// diccionario
			total[dinero.moneda] += dinero.monto;
		}
		
		return total[usd] * 123123 + total[ars];
	}
}
