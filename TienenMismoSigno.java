package LaboratorioPOO;

import java.util.Scanner;

public class TienenMismoSigno {

	public static void main(String[] args) {
		boolean respuesta = true;
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese un numero");
		int numA = sc.nextInt();
		System.out.println("Ingrese otro numero");
		int numB = sc.nextInt();
		
		if (numA < 0 && numB < 0 || numA > 0 && numB > 0 )
			System.out.println(respuesta);
		
	}

}
