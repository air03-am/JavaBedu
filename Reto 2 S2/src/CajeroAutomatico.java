// Importar la clase Scanner para leer entradas del usuario
import java.util.Scanner;

public class CajeroAutomatico {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in); // Crear objeto Scanner
        var saldo = 1000.00; // Saldo inicial
        int opcion;  // Varibale para la opción del menú

        do {
            // Menú d eopciones
            System.out.println("\n Bienvenido al cajero automático");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Salir");
            System.out.println("Selecciona una opción: ");

            opcion = scanner.nextInt(); // Leer la opción elegida por el usuario
            // Estructura switch para manejar las opciones
            switch (opcion) {
                case 1 -> {
                    // consultar saldo
                    System.out.println("Tu saldo actual es: $" + saldo);
                }
                case 2 -> {
                    // Depositar dinero
                    System.out.println("Ingrese el monto a depositar: ");
                    double deposito = scanner.nextDouble();

                    if (deposito <= 0){
                        // Validación: el monto debe ser mayor a cero
                        continue; // volver al menú sin modificar el saldo
                    }
                    saldo += deposito; // Sumar el deposito al saldo
                    System.out.println("Deposito realizado. Saldo actualizado: $" + saldo);
                }
                case 3 -> {
                    // Retirar dinero
                    System.out.println("Ingrese el monto a retirar: ");
                    double retiro = scanner.nextDouble();

                    if (retiro <= 0) {
                        // Validación: el monto debe ser mayor a cero
                        System.out.println("El monto debe ser mayor a cero");
                        continue; // Volver al menú sin hacer nada
                    }
                    if (retiro > saldo) {
                        System.out.println("SAldo insuficiente. Tu saldo es: $" + saldo);
                    } else {
                        saldo -= retiro; // Restar el monto del saldo
                        System.out.println("Retiro exitoso. Saldo restante: $ " + saldo);
                    }
                }
                case 4 -> {
                    // Salir del progrma
                    System.out.println("Gracias por usar el cajero, ¡Hasta pronto!");
                }
                default -> {
                    // Opción no valida
                    System.out.println("Opción iinvalida, intente nuevamente");
                }
            }
        } while (opcion != 4); // Salir cuando el usuario elija la opción 4

        scanner.close(); // Cerrar el Scanner
    }
}
