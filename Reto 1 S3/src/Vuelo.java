public class Vuelo {
    // Atributos
    final String codigoVuelo; // Constante
    String destino;
    String horaSalida;
    Pasajero asientoReservado; // Se asignara una instancia o null

    // Metodos
    public Vuelo(String codigoVuelo, String destino, String horaSalida) { // constructor del vuelo
        this.codigoVuelo = codigoVuelo;
        this.destino = destino;
        this.horaSalida = horaSalida;
        this.asientoReservado = null;
    }

    // Método con parámetro y valor de retorno
    public boolean reservarAsiento(Pasajero p) {
        if (asientoReservado == null) {
            asientoReservado = p;
            return true;
        } else {
            return false;
        }
    }

    // Método con sobrecarga permite reservar con una cadena simples
    public boolean reservarAsiento(String nombre, String pasaporte) {
       Pasajero nuevoPasajero = new Pasajero(nombre, pasaporte);
       return reservarAsiento(nuevoPasajero);
    }

    // Método sin retorno
    public  void cancelarReserva(){
        asientoReservado = null;
    }

    // Método que retorna String
    public String obtenerItinerario(){
        String info = "Itinerario del vuelo: \n";
        info += "Código: " + codigoVuelo + "\n";
        info += "Destino: " + destino + "\n";
        info += "Salida: " + horaSalida + "\n";
        if (asientoReservado != null) {
            info += "Pasajero: " + asientoReservado.nombre + "\n";
        } else {
            info += "Pasajero: [Sin reserva]\n";
        }
        return info;
    }
}
