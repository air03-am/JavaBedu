public class Main {
    public static void main(String[] args) {
        // Crear un pasajero
        Pasajero pasajero = new Pasajero("María José González", "U2017P");

        // Crear un vuelo
        Vuelo vuelo = new Vuelo("Ab200", "Corea", "22:30");

        // Reservar asiento
        boolean reservado = vuelo.reservarAsiento(pasajero);
        if (reservado) {
            System.out.println("Reserva realizada con éxito.\n");
        } else {
            System.out.println("No se pudo realizar la reserva.\n");
        }

        // Mostar intinerario
        System.out.println(vuelo.obtenerItinerario());

        // Cancelar reserva
        System.out.println("Cancelando reserva\n");
        vuelo.cancelarReserva();

        // Mostrar itinerario actualizado
        System.out.println(vuelo.obtenerItinerario());

        //Realizar nuevamente una reserva

        vuelo.reservarAsiento("Jesus González", "U2018X");
        System.out.println(vuelo.obtenerItinerario());
    }
}
