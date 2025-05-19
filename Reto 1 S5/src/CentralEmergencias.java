public class CentralEmergencias {
    public static void main(String[] args) {
        Ambulancia ambulancia = new Ambulancia("Ambulancia", "Jesús");
        Patrulla patrulla = new Patrulla("Patrulla", "Claudia");
        UnidadBomberos bomberos = new UnidadBomberos("UnidadBomberos", "Sofia");

        ambulancia.iniciarOperacion();
        System.out.println();

        patrulla.iniciarOperacion();
        System.out.println();

        bomberos.iniciarOperacion();
    }
}
