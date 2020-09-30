package pe.egcc.pjvideo07;

import java.util.Scanner;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/c/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class Demostracion {

	public static void main(String[] args) {

		// Variables
		double precio, subtotal, descuento, total;
		int cantidad;
		Scanner scanner = new Scanner(System.in);
		// Lectura de datos
		System.out.println("Precio: ");
		precio = scanner.nextDouble();
		System.out.println("Cantidad:");
		cantidad = scanner.nextInt();
		// Proceso
		subtotal = precio * cantidad;
		descuento = subtotal * (cantidad >= 12?0.20:0.0);
		total = subtotal - descuento;
		// Reporte
		System.out.println("");
		System.out.println("REPORTE");
		System.out.println("Subtotal: " + subtotal);
		System.out.println("Descuento: " + descuento);
		System.out.println("Total: " + total);
	}

}
