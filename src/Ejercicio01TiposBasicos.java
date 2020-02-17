
public class Ejercicio01TiposBasicos {

	public static void main(String[] args) {
		byte b =   60;
		short s = 32_000;
		int i = 2_000_000_000;
		long l = 1L;
		float f = 12;
		float f1 = 12.4F;
		double d1 = 12.45;
		double d2 = 1.7e34;
		char letra = 'g';
		boolean existe = false;
		
		i = (int)(3 * 2.5);
		i = 3 * (int)2.5;
		
		f1 = (float)(3 * 3.5);
		f1 = 3 * (float)3.5;
		
		System.out.println("Byte : " + b);
		System.out.println("Short : " + s);
		System.out.println("Int : " + i);
		System.out.println("Long : " + l);
		System.out.println("float : " + f);
		System.out.println("float f1: " + f1);
		
		System.out.println("double 1 : " + d1);
		System.out.println("double 2 : " + d2);
		System.out.println("char : " + letra);
		System.out.println("boolean : " + existe);
		
		
	}

}
