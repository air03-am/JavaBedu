import java.util.*;

public class RegistroMuestras {
    public static void main(String[] args) {
        // Paso 1: ArrayList para registrar todas las especies en orden de llegada
        ArrayList<String> muestras = new ArrayList<>();
        muestras.add("Perro");
        muestras.add("Gato");
        muestras.add("Caballo");
        muestras.add("Perro");

        // Paso 2: HashSet para ofiltar especies únicas
        HashSet<String> especiesUnicas = new HashSet<>(muestras);

        // Paso 3: HashMap para asociar el ID de muestra del investigador
        HashMap<String, String> muestrasInvestigador = new HashMap<>();
        muestrasInvestigador.put("M-001", "Dr. Mora");
        muestrasInvestigador.put("M-002", "Dr. Onofre");
        muestrasInvestigador.put("M-003", "Dra. Aparicio");

        // Paso 4: Mostrar resultados
        System.out.println("Muestras recibidas en orden:");
        for (String especie : muestras) {
            System.out.println("• " + especie);
        }

        System.out.println("\nEspecies únicas procesadas:");
        for (String especieUnica : especiesUnicas) {
            System.out.println("• " + especieUnica);
        }

        System.out.println("\nAsignación de muestras a investigadores:");
        for (Map.Entry<String, String> entry : muestrasInvestigador.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }




        // Búsqueda de investigador por ID
        System.out.println("\nBúsqueda de investigador por ID de muestra:");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese ID de muestra (ej. M-002): ");
        String idBusqueda = scanner.nextLine();

        if (muestrasInvestigador.containsKey(idBusqueda)) {
            System.out.println("Investigador responsable: " + muestrasInvestigador.get(idBusqueda));
        } else {
            System.out.println("No se encontró un investigador para ese ID.");
        }

        scanner.close();

    }
}