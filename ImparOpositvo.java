package LaboratorioPOO;

import java.util.Scanner;

public class ImparOpositvo {

	public static void main(String[] args) {
		// 2. Escriba una sentencia de Java que imprima true (verdadero), si num es un
		// número impar y positivo.

		boolean respuesta = true;
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese un numero");
		int num = sc.nextInt();

		if (num % 2 != 0 && num >= 0)
			System.out.println(respuesta);

	}

}
