package LaboratorioPOO;

import java.util.Scanner;

public class SieteDiasSemana {

	public static void main(String[] args) {
		String nombreDia;
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese el numero del dia de la semana");
		int dia = sc.nextInt();
		
		switch (dia) {
		
		case 1: 
			nombreDia = "Lunes";
			break;
		case 2: 
			nombreDia = "Martes";
			break;
		case 3: 
			nombreDia = "Miércoles";
			break;
		case 4: 
			nombreDia = "Jueves";
			break;
		case 5: 
			nombreDia = "Viernes";
			break;
		case 6: 
			nombreDia = "Sábado";
			break;
		case 7: 
			nombreDia = "Domingo";
			break;
		default:
			nombreDia = "Este dia no existe";

		}
		System.out.println("De acuerdo al numero ingresado usted escogio el: "+nombreDia);

	}
}