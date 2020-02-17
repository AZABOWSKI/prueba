
public class Ejercicio06AlternativaPorValor {

	public static void main(String[] args) {
		String opcion = "alta";
		// opciones validas: alta, baja, modificar, validar
		
		if (opcion == "alta") {
			System.out.println("vas a dar de alta");
			System.out.println("ALTA");
		}else  if (opcion == "baja") {
			System.out.println("vas a dar de baja");
			System.out.println("BAJA");
		}else if (opcion == "modificar") {
			System.out.println("vas a modificar");
			System.out.println("MODIFICAR");
		}else if (opcion == "validar") {
			System.out.println("vas a validar");
			System.out.println("VALIDAR");
		}else {
			System.out.println("opcion erronea");
			System.out.println("ERROR");
		}
		
		System.out.println("SALIDA CON SWITCH");
		System.out.println("entero: byte, short, int long, char, String");
		
	switch(opcion) {
		case "alta": 
		case "ALTA":
			System.out.println("vas a dar de alta");
			System.out.println("ALTA");
			break;
		case "baja":
			System.out.println("vas a dar de baja");
			System.out.println("BAJA");
			break;
		case "modificar":
			System.out.println("vas a modificar");
			System.out.println("MODIFICAR");
			break;
		case "validar":
			System.out.println("vas a validar");
			System.out.println("VALIDAR");
			break;
		default:
			System.out.println("opcion erronea");
			System.out.println("ERROR");
		}
		
		System.out.println("switch terminado");
	}

}
