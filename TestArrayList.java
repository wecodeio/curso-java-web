package colecciones;

import java.util.ArrayList;
import java.util.List;

public class TestArrayList {

	public static void main(String[] args) {
		List<Integer> lista = new ArrayList<Integer>();
		
		
		System.out.println("Esta vacio?: " + lista.isEmpty());
		lista.add(2);
		lista.add(1, 5);
		lista.add(1, 6);
		lista.add(3);
	
		System.out.println("toString: " + lista);
		lista.remove((Integer)2);
		lista.remove(1);
		System.out.println("toString: " + lista);
		System.out.println("Esta vacio?: " + lista.isEmpty());
		System.out.println("Posición del elemento 5: " + lista.indexOf(5));
		System.out.println("Tamaño del vector: " + lista.size());

	}

}
