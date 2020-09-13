package pe.egcc.pjvideo005;

import java.util.Scanner;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/c/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class Demo01 {

	public static void main(String[] args) {
		// Variables
		int num1, num2, num3, num4, mayor;
		Scanner scanner = new Scanner(System.in);
		// Lectura de los números
		System.out.println("Número 1: ");
		num1 = scanner.nextInt();
		System.out.println("Número 2: ");
		num2 = scanner.nextInt();
		System.out.println("Número 3: ");
		num3 = scanner.nextInt();
		System.out.println("Número 4: ");
		num4 = scanner.nextInt();
		// Proceso
		mayor = Math.max(num1, num2);
		mayor = Math.max(mayor, num3);
		mayor = Math.max(mayor, num4);
		// Reporte
		System.out.println("Número mayor: " + mayor);
	}

}
