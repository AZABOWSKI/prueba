import java.util.Scanner;

public class Ejercicio03LeerDatos {

	public static void main(String[] args) {
		// numeros aleatorios : Math.random()
		// numeros entr 1 y 10
		Scanner leer = new Scanner(System.in);
		int numero = 0;
		
		numero = (int) (Math.random() * 10 +1);
		String nombre = null;
		System.out.println(numero);
		
		//Leer de la consola
		
		System.out.println("dame un numero : ");
		numero = leer.nextInt();
		
		System.out.println("dame un nombre : ");
		nombre = leer.next();
		System.out.println(numero);
		System.out.println(nombre.toUpperCase());
		System.out.println(nombre.charAt(4));
		
		
		
		leer.close();
		
		

	}

}
