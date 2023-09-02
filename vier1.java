package LaboratorioPOO;

public class vier1 {

	public static void main(String[] args) {
		
		//1. Indicar cuál es la siguiente salida (resultado) de cada uno de los fragmentos de códigos:
		
		if (6 < 6 * 50)
		System.out.println("Hello");
		System.out.println("There");
		
		//Respuesta: Hello
		//There
		
		
		
		
		int x = 1, y = 2, z = 3;
		if (x > y)
		if (x > z)
			System.out.println("1111");
		else
			System.out.println("2222");

		// Respuesta: No compila, debido que no se da ninguna instruccion en el primer
		// if.
		
		
		

		int x = 1, y = 2, z = 3;
		if (x < z)
			System.out.println("*");
		else if (x == z)
			System.out.println("&");
		else
			System.out.println("$");

		// Respuesta: Imprime *
		
		
		
		
		
		int x = 1, y = 2, z = 3;
		if (x < y)
			System.out.println("####");
		else
			System.out.println("&&&&");
			System.out.println("****");

		// Respuesta: ####
		//            ****
		
			
			
		int x = 1, y = 2, z = 3;
		if (x > y)
				System.out.println("####");
		else
				System.out.println("&&&&");
				System.out.println("****");

		// Respuesta: &&&&
		//            ****
				
				

		int a1 = 100;
		int a2 = 200;

		if (a1 > 100 && a2 <= 200)
			System.out.println(a1 + " +" + a2 + " " + (a1 + a2));
		else
			System.out.println(a1 + " +" + a2 + " " + (2 * a1 - a2));

		// Respuesta: 100 +200 0
		
		
		
		
		
		
		int a = 1, b = 2, c = 3;
		if(++a > b++ || a-- >0)
			c++;
		else
			c--;
		System.out.println(a+" "+b+" "+c);
		
		// En este caso, para que el codigo funcione cambie las variables
		// Respuesta: 1 3 4
		
		
		
		
		
		
		int x = 1, y = 2, z = 3;
		if(x<y){
			System.out.println("####");
			System.out.println("****");
		}
		else
			System.out.println("&&&&");
		//Respuesta: ####
		//           ****
		
		
		
		
		

		int x = 1, y = 2, z = 3;
		if ('x' > 'y' || 66 > (int) ('A'))
			System.out.println("#*#");

		// Resultado: #*#
		
		
		

		int x = 1, y = 2, z = 3;
		if (x < z)
			System.out.println("*");
		else if (x == z)
			System.out.println("&");
		else
		 	System.out.println("$");

		// Respuesta: Muestra en pantalla: *
	}
}
