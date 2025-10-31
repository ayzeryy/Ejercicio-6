package controlador;

import modelo.*;
import java.util.Scanner;

public class Controlador {
    private CatalogoDispositivos catalogo = new CatalogoDispositivos();
    private Scanner sc = new Scanner(System.in);

    public void iniciar() {
        catalogo.inicializarCatalogo();
        mostrarMenu();
    }

    private void mostrarMenu() {
        int opcion;
        do {
            System.out.println("\n--- MENÚ PRINCIPAL ---");
            System.out.println("1. Listar dispositivos");
            System.out.println("2. Buscar por ID");
            System.out.println("3. Buscar por nombre");
            System.out.println("4. Ordenar por consumo eléctrico");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();
            ejecutarOpcion(opcion);
        } while (opcion != 0);
    }

    private void ejecutarOpcion(int opcion) {
        switch (opcion) {
            case 1 -> catalogo.listarDispositivos();
            case 2 -> {
                System.out.print("Ingrese ID: ");
                int id = sc.nextInt();
                Dispositivo d = catalogo.buscarPorId(id);
                System.out.println(d != null ? d : "No encontrado.");
            }
            case 3 -> {
                System.out.print("Ingrese nombre: ");
                String nombre = sc.nextLine();
                Dispositivo d = catalogo.buscarPorNombre(nombre);
                System.out.println(d != null ? d : "No encontrado.");
            }
            case 4 -> {
                catalogo.ordenarPorConsumo();
                System.out.println("Catálogo ordenado por consumo:");
                catalogo.listarDispositivos();
            }
            case 0 -> System.out.println("Saliendo del sistema...");
            default -> System.out.println("Opción inválida.");
        }
    }
}
