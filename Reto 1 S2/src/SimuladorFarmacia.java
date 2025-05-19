// Importamos el paquete java.util
// Clase Scanner: nos permite leer datos ingresados por el usuario
import java.util.Scanner;

public class SimuladorFarmacia {
    public static void main(String[] args) { //Método principal
        Scanner scanner = new Scanner(System.in);
        // Solicitud de datos al usuario y declaramos atributos del producto
        System.out.print("Nombre del medicamento: ");
        String nombreMedicamento = scanner.nextLine();

        System.out.print("Precio unitario: ");
        double precioUnitario = scanner.nextDouble();

        System.out.print("Cantidad de piezas: ");
        int cantidadPiezas = scanner.nextInt();

        // Calculamos el total
        double totalSinDescuento = precioUnitario * cantidadPiezas;

        // Evaluamos su aplica a descuento si el total supera 500.00
        var aplicaDescuento = totalSinDescuento > 500.00;

        // Asignación del descuento usando el operador ternario (? :)
        double descuento = aplicaDescuento ? totalSinDescuento * 0.15 : 0;

        // Total a pagar
        double total = totalSinDescuento - descuento;
        // Muestra en consola el resumen con el siguiente formato:
        // Medicamento: Amoxicilina
        // Cantidad: 5
        // Precio unitario: $120.0
        // Total sin descuento: $600.0
        // ¿Aplica descuento?: true
        // Descuento: $90.0
        // Total a pagar: $510.0
        System.out.println("\nResumen de compra: ");
        System.out.println("Medicamento: " + nombreMedicamento);
        System.out.println("Cantidad: " + cantidadPiezas);
        System.out.println("Precio unitario: $" + precioUnitario);
        System.out.println("Total sin descuento: $" + totalSinDescuento);
        System.out.println("¿Aplica descuento?: " + aplicaDescuento);
        System.out.println("Descuento: $" + descuento);
        System.out.println("Total a pagar: $" + total);

        scanner.close();

    }
}
