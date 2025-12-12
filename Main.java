import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static final String[] COMARCAS = {
            "Osona", "Segrià", "Baix Ebre", "Garrotxa", "Pla d'Urgell"
    };

    int[][] inspecciones = new int[5][7];
    boolean[] positivos = new boolean[5];
    ArrayList<String> quarantena = new ArrayList<>();

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
                    registrarInspeccion();
                    break;
                case 2:
                    estadoGeneral();
                    break;
                case 3:
                    gestionMovimentos();
                    break;
                case 4:
                    incidencias();
                    break;
                case 0:
                    System.out.println("Sortint...");
                    break;
            }
        } while (opcion != 0);
    }

}
