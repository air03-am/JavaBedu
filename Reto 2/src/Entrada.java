public class Entrada {
    // Atributos
    // Nombre del evento ( String)
    // Precio de la entrada ( double)

    String evento;
    double precio;

    // Constructor que recibe ambos valores al momento de crear un objeto
    public Entrada (String evento, double precio) {
        this.evento = evento;
        this.precio = precio;
    }
    // Agrega un método público llamado mostrarInformacion()que imprime el siguiente formato:
    // Evento: Obra de Teatro | Precio: $450.0
    public void mostrarInformacion() {
        System.out.println("Evento: " + evento + " | Precio: $" + precio);
    }

    }
