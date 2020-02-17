import java.util.Scanner;

public class Lunes28Noche {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		
		int numero = 0;
		double salario = 0.0;
		String nombre = null;
		
		System.out.println("dame un entero : ");
		numero = leer.nextInt();
		
		System.out.println("dame un con decimales : ");
		salario = leer.nextDouble();
		
		System.out.println("dame un nombre : ");
		nombre = leer.next();
		
		
		System.out.println(numero);
		System.out.println(salario);
		System.out.println(nombre);
		
		leer.close();
		numero = (int) (Math.random()*50+1);
		System.out.println(numero);

	}

}
