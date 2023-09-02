package LaboratorioPOO;

import java.util.Scanner;

public class NumPositivos {

	public static void main(String[] args) {

		// 2. Escriba una sentencia de Java que imprima true (verdadero), si tanto numA como numB son
		// números positivos.

		boolean respuesta = true;
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese un numero");
		int numA = sc.nextInt();
		System.out.println("Ingrese otro numero");
		int numB = sc.nextInt();

		if (numA >= 0 && numB >= 0)
			System.out.println(respuesta);

	}

}