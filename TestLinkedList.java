package colecciones;

import java.util.LinkedList;
import java.util.List;

public class TestLinkedList {

	public static void main(String[] args) {
		LinkedList<Integer> lista = new LinkedList<Integer>();
		System.out.println("Esta vacia?: " + lista.isEmpty());
		lista.add(2);
		lista.add(1, 5);
		lista.add(1,6);
		lista.add(3);
		System.out.println("Tamaño de la lista: " + lista.size());
	
	
		System.out.println("toString: " + lista);
		System.out.println(lista.remove((Integer) 6));
		System.out.println("toString: " + lista);
		System.out.println("Esta vacia?: " + lista.isEmpty());
		System.out.println("Elemento en pos 1?: " + lista.get(1));
		System.out.println("Tamaño de la lista: " + lista.size());
	}

}
