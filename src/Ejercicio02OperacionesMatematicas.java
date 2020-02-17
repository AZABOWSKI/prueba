
public class Ejercicio02OperacionesMatematicas {

	public static void main(String[] args) {
/*		 int a = 27, b = 19,resul = 0;
		 
		 resul = a + b;
 		 System.out.println("OPERACIONES SENCILLAS");
		 System.out.println("La suma : espero 26 " + resul);
		 System.out.println("La suma :  espero 26 " + a + b);
		 System.out.println("La suma :  espero 26 " + (a + b));
		 
		 System.out.println("el producta da : " + (a * b));
		 System.out.println("la resta da : " + (a - b));
		 System.out.println("la division da : " + (a / b));
		 System.out.println("el resto que  da : " + (a % b));
*/
		System.out.println("OPERACIONES unarias ++ y --");
		//para contar o descontar de uno en uno
		int num1 = 7;
		
	num1 = num1 -1;
	num1 -= 1;
		num1--;
		--num1;
	//	num1 *=15;
		System.out.println(num1);
		 
		//para acumular 
		 
		 int acum =0, num4=22, num2 = 45, num3 = 80;
		 
	//	 acum = acum + num4;
		 acum += num4;
		 acum += num2;
		 acum += num3;
		 
		 System.out.println(acum);
		 
	//operaciones aritmética con ++ y --
		int a = 4, b = 7 , resul = 0;
		
//		resul = a + b++; //primero se suma a + b y se iguala a resul 
		                 // y luego b se incrementa en 1
//		System.out.println("resultado :  11 " + resul);
//		System.out.println("y ahora b tiene  8 : " + b);
 		resul = a + ++b; // primero b se incrementa en uno y
 		                 // luego se suma con a y se vuelca a resul
		
		System.out.println("resultado :  12 " + resul);
		System.out.println("y ahora b tiene  8 : " + b);
		
		//operaciones matematicas
		
		System.out.println("resultado : " + ((7 + 4) * 2));
		
		
		
		 
		 
		 

	}

}
