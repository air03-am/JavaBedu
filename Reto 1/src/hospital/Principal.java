package hospital;
import java.util.Scanner;

public class Principal {
    public static void main(String[] arg){
        //Crear objetos
        Scanner input = new Scanner(System.in);
        Paciente p1 = new Paciente();
        //Sout
        System.out.print("Ingrese el nombre del paciente: ");
        p1.nombreDelPaciente = input.nextLine();

        System.out.print("Ingrese la edad del paciente: ");
        p1.edadDelPaciente = input.nextInt();
        input.nextLine(); //Limpiar el buffer (memoria)

        System.out.print("Ingrese el número del expediente del paciente: ");
        p1.numeroDeExpediente = input.nextLine();
        input.close(); //indica que ya no se pediran datos y cierra el scanner

        p1.mostrarInformacion();
    }
}
