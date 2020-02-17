
public class Ejercicio07TodosLosBucles {

	public static void main(String[] args) {
		int num = 1, cont = 0, acum=0;
		// de 1 a n veces
		do {
			System.out.println("numero do while: " + num);
			cont ++;
			 
			acum += num;
			num++;
			
			
		}while (cont <10);
		System.out.println("total acum : " + acum);
	 	
		num=1;
		cont=0;
		acum=0;
		// de cero a n veces
		while(cont <10) {
			System.out.println("numero while: " + num);
			cont ++;
			acum += num;
			num++;
		}
		System.out.println("total acum : "  + acum);
		 
		num=1;
		
		acum=0;
		for (cont = 0; cont < 10; cont++) {
			System.out.println("numero con for : " + num);
			 if (cont%2 == 0)
				 continue;
			acum+= num;
			num++;
			
		}
		System.out.println("total acum : "  + acum);
		
		num=1;
		
		acum=0;
		for (int i = 0; i < 10; i++) {
			System.out.println("numero con for : " + num);
			System.out.println(i);
			acum+= num;
			num++;
			
		}
//		System.out.println("i contiene : " + i);
		
		System.out.println("total acum : "  + acum);
	}

}
