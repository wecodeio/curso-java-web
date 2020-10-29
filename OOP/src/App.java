import java.util.Arrays;

public class App {

	public static void main(String[] args) {
		
		String unoSolito = "Hola";
		String[] varios = {"Hola", "Que", "Tal"};
		
		String[] desconocido = new String[1000];
		
		
		desconocido[-999999] = "Lala";
		
		System.out.println(unoSolito);
		System.out.println(Arrays.toString(varios));
		System.out.println(Arrays.toString(desconocido));
	}
	
}
