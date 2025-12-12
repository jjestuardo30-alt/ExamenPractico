import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static final String[] COMARCAS = {
            "Osona", "Segrià", "Baix Ebre", "Garrotxa", "Pla d'Urgell"
    };

    int[][] inspecciones = new int[5][7];
    boolean[] positivos = new boolean[5];
    ArrayList<String> cuarentena = new ArrayList<>();

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().menu();
    }

    void menu() {
        int opcion;
        do {
            System.out.println("\n--- MENÚ PRINCIPAL ---");
            System.out.println("1. Registrar nueva inspeccion");
            System.out.println("2. Visualizar Estado General");
            System.out.println("3. Gestionar Movimentos de Bestias");
            System.out.println("4. Listado de Incidencias");
            System.out.println("0. Salir");

            opcion = leerNumero(0, 4);

            switch (opcion) {
                case 1:
                    RegistrarNuevaInspeccion();
                    break;
                case 2:
                    EstadoGeneral();
                    break;
                case 3:

                    GestionMovimentos();
                    break;
                case 4:
                    Incidencias();
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
            }
        } while (opcion != 0);
    }

}

void registrarNuevaInspeccion() {
    mostrarComarcas();
    int comarca = leerNumero(1, 5) - 1;
    int dia = leerNumero(1, 7) - 1;
    System.out.println("Numero de Inspecciones");

    int num = scanner.nextInt();
    scanner.nextLine();
    inspecciones[comarca][dia] += num;
    System.out.println("Inspeccion Registrada");
}

void estadoGeneral() {
    for (int i = 0; i < COMARCAS.length; i++) {
        int total = 0;
        for (int d = 0; d < 7; d++)
            total += inspecciones[i][d];
        String mensaje = (total < 20) ? "RIESGO: Reforzar inspecciones" : "COBERTURA SUFICIENTE";
        System.out.println(COMARCAS[i] + ": " + total + " → " + mensaje);
    }
}

void gestionMovimientos() {
    System.out.println("1. Solicitar permiso de movimiento");
    System.out.println("2. Añadir granja a cuarentena");
    System.out.println("3. Volver");
    int opcion = leerNumero(1, 3);

    if (opcion == 1) {
        System.out.print("ID granja origen: ");
        String id = scanner.nextLine();
        if (cuarentena.contains(id)) {
            System.out.println("MOVIMIENTO DENEGADO: Granja en cuarentena.");
        } else {
            System.out.println("MOVIMIENTO APROBADO: Proceder con el traslado.");
        }
    } else if (opcion == 2) {
        System.out.print("ID granja: ");
        String id = scanner.nextLine();
        cuarentena.add(id);
        System.out.println("Granja añadida a cuarentena.");
    }
}