package hospital;

public class Paciente {
    // Atributos
    // Nombre del paciente (String)
    // Edad del paciente (int)
    // Número de expediente (String)
    String nombreDelPaciente, numeroDeExpediente;
    int edadDelPaciente;

    //Método
    public void mostrarInformacion(){
        System.out.println("Información del(la) paciente: ");
        System.out.println("Paciente: " + nombreDelPaciente);
        System.out.println("Edad: " + edadDelPaciente);
        System.out.println("Expediente: " + numeroDeExpediente);
    }

}