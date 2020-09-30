package pe.egcc.pjvideo06;

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
		 double precioCompra, precioVenta;
		 Scanner scanner = new Scanner(System.in);
		 // Lectura
		 System.out.println("Precio de compra:");
       precioCompra = scanner.nextDouble();
		 // Proceso
		 precioVenta = precioCompra * ( 1 + 0.40);
		 // Reporte
		 System.out.println("Precio de venta: " + precioVenta);
    }

}
