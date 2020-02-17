
public class Ejercicio08ForArray {

	public static void main(String[] args) {
		int [] enteros = {1,3,45,67,89};
		
		for (int i = 0; i < 5; i++) {
			System.out.println("en la posicion : "+ i + "  hay : " + enteros[i]);
		}
		
		for (int numero: enteros) {
			System.out.println("numero : " + numero);
		}

	}

}
