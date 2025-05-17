public record Entrada_Record (String evento, double precio) {
    // convierte la clase Entradaen un recordpara ver una forma más compacta de declarar
    // estructuras de datos en Java moderno, genera un nuevo archivo Entrada_Recordy crea
    // un registro extra.
    public void mostrarInformacion() {
        System.out.println("Evento: " + evento + " | Precio: $" + precio);
    }
}
