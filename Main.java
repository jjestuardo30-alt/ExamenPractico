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
