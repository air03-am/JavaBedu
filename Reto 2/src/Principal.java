public class Principal {
    public static void main(String[] args){
        // Crea al menos dos objetos de tipoEntrada
        Entrada entrada1 = new Entrada("Presentación de baile moderno", 200.00);
        Entrada entrada2 = new Entrada("Orquesta sinfonica de Harry Potter", 1500.00);

        entrada1.mostrarInformacion();
        entrada2.mostrarInformacion();

        Entrada_Record entrada3 = new Entrada_Record("Concierto Harry Styles", 3500.00);
        entrada3.mostrarInformacion();

    }

}
