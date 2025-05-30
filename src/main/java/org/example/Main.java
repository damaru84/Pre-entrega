package org.example;


import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean salir = false;

        while (!salir) {
            mostrarMenu();
            int opcion = leerEntero("Seleccione una opción: ");

            switch (opcion) {
                case 1:
                    agregarProducto();
                    System.out.println("Gracias el producto fue agregado exitosamente.");
                    break;
                case 2:
                    listarProductos();
                    System.out.println("Gracias la lista productos es la siguiente:");
                    break;

                case 3:
                    buscarActualizarProducto();
                    System.out.println("Gracias actualice el producto.");
                    break;
                case 4:
                    eliminarProducto();
                    System.out.println("Gracias el producto fue eliminado exitosamente.");
                    break;
                case 5:
                    crearPedido();
                    System.out.println("Cargue el producto.");
                    break;
                case 6:
                    listarPedidos();
                    System.out.println("inserte la lista a agregar.");
                    break;
                case 7:
                    salir = true;
                    System.out.println("Gracias por usar el sistema.");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        }
    }
    // Métodos vacíos por ahora, para evitar errores de compilación
    private static void mostrarMenu() {
        System.out.println("1. Agregar producto");
        System.out.println("2. Listar productos");
        System.out.println("3. Buscar/Actualizar producto");
        System.out.println("4. Eliminar producto");
        System.out.println("5. Crear pedido");
        System.out.println("6. Listar pedidos");
        System.out.println("7. Salir");
    }


    private static int leerEntero(String mensaje) {
        System.out.print(mensaje);
        int seleccion = sc.nextInt();

        return seleccion;


    }

    private static void agregarProducto() {
        sc.nextLine();  // Limpiar el buffer de entrada
        System.out.print("Nombre del producto: ");
        String nombre = sc.nextLine();

        System.out.print("Precio del producto: ");
        double precio = sc.nextDouble();
        String i = sc.nextLine();
        System.out.print("Stock del producto: ");
        int stock = sc.nextInt();


    }
    private static void listarProductos() {}
    private static void buscarActualizarProducto() {}
    private static void eliminarProducto() {}
    private static void crearPedido() {}
    private static void listarPedidos() {}
}