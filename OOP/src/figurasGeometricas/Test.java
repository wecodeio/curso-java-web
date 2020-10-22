package figurasGeometricas;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		
		Circulo c1 = new Circulo(new Punto(1,1),"rojo",4);
		Elipse e1 = new Elipse(new Punto(0,0),"blanca", 2, 6);
		Cuadrado cua1 = new Cuadrado(new Punto(2,2), "rosa", 4);
		Figura figu = new Circulo(new Punto(1,1),"rojo",5);
		Figura pipi = new Cuadrado(new Punto(2,2), "rosa", 1);
		
		Figura [] figuras = {c1,e1,cua1,figu,pipi};
		
		for(Figura f : figuras)
			System.out.println(f.getArea());
			
		System.out.println("------------------------------------");
		
		Arrays.sort(figuras);
		
		for(Figura f : figuras)
			System.out.println(f.getColor());
		
		
		

	}

}
