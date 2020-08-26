package pe.egcc.pjvideo003;

import java.util.Scanner;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/c/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class Matematica {

	public static void main(String[] args) {
		// Variables
		int num1, num2, suma, producto;
		Scanner scanner = new Scanner(System.in);
		// Lectura de datos
		System.out.println("LECTURA DE LOS DATOS");
		System.out.println("Número 1:");
		num1 = scanner.nextInt();
		System.out.println("Número 2:");
		num2 = scanner.nextInt();
		// Proceso
		suma = num1 + num2;
		producto = num1 * num2;
		// Reporte
		System.out.println("");
		System.out.println("REPORTE");
		System.out.println("Suma: " + suma);
		System.out.println("Producto: " + producto);
	}

}
