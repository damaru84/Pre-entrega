package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Inventario {
    public static Scanner sc = new Scanner(System.in);
    private static final ArrayList<Producto> carrito = new ArrayList<>();

    public static void main(String[] args) {
        boolean salir = false;

        while (!salir) {
            mostrarMenu();
            int opcion = leerEntero("Seleccione una opción: ");

            switch (opcion) {
                case 1 -> agregarProducto();
                case 2 -> listarProductos();
                case 3 -> buscarActualizarProducto();
                case 4 -> eliminarProducto();
                case 5 -> crearPedido();  // aún falta
                case 6 -> listarPedidos();  // aún falta
                case 7 -> {
                    salir = true;
                    System.out.println("Gracias por usar el sistema.");
                }
                default -> System.out.println("Opción inválida.");
            }
        }
    }

    private static void mostrarMenu() {
        System.out.println("\n*** MENÚ ***");
        System.out.println("1. Agregar producto");
        System.out.println("2. Listar productos");
        System.out.println("3. Buscar/Actualizar producto");
        System.out.println("4. Eliminar producto");
        System.out.println("5. Crear pedido");
        System.out.println("6. Listar pedidos");
        System.out.println("7. Salir");
        System.out.println("*******************");
    }

    private static int leerEntero(String mensaje) {
        System.out.print(mensaje);
        while (!sc.hasNextInt()) {
            System.out.println("Por favor ingrese un número válido.");
            sc.next();  // descarta la entrada inválida
        }
        return sc.nextInt();
    }

    private static double leerDouble(String mensaje) {
        System.out.print(mensaje);
        while (!sc.hasNextDouble()) {
            System.out.println("Por favor ingrese un número válido.");
            sc.next();  // descarta la entrada inválida
        }
        return sc.nextDouble();
    }

    private static void agregarProducto() {
        sc.nextLine();  // limpiar buffer
        System.out.println("Nombre del producto: ");
        String nombre = sc.nextLine();
        double precio = leerDouble("Precio del producto: ");
        int stock = leerEntero("Stock del producto: ");
        Producto nuevo = new Producto(nombre, precio, stock);
        carrito.add(nuevo);
        System.out.println("Producto agregado con éxito.");
    }

    private static void listarProductos() {
        if (!carrito.isEmpty()) {
            System.out.println("\nLISTA DE PRODUCTOS:");
            for (Producto p : carrito) {
                p.print();
            }
        } else {
            System.out.println("No hay productos en el sistema.");
        }
    }

    private static void buscarActualizarProducto() {
        sc.nextLine();  // limpiar buffer
        System.out.print("Ingrese el nombre del producto a buscar: ");
        String busqueda = sc.nextLine();
        boolean encontrado = false;

        for (Producto p : carrito) {
            if (!p.contieneNombre(busqueda)) continue;
            System.out.println("Producto encontrado:");
            p.print();
            System.out.print("¿Desea actualizar este producto? (s/n): ");
            String resp = sc.nextLine();
            if (resp.equalsIgnoreCase("s")) {
                System.out.print("Nuevo nombre: ");
                String nuevoNombre = sc.nextLine();
                double nuevoPrecio = leerDouble("Nuevo precio: ");
                int nuevoStock = leerEntero("Nuevo stock: ");
                p.actualizar(nuevoNombre, nuevoPrecio, nuevoStock);
                System.out.println("Producto actualizado.");
            }
            encontrado = true;
        }

        if (!encontrado) {
            System.out.println("No se encontraron productos que coincidan.");
        }
    }

    private static void eliminarProducto() {
        sc.nextLine();  // limpiar buffer
        System.out.print("Ingrese el nombre del producto a eliminar: ");
        String nombre = sc.nextLine();
        Producto aEliminar = null;

        for (Producto p : carrito) {
            if (p.nombre.equalsIgnoreCase(nombre)) {
                aEliminar = p;
                break;
            }
        }

        if (aEliminar != null) {
            carrito.remove(aEliminar);
            System.out.println("Producto eliminado con éxito.");
        } else {
            System.out.println("Producto no encontrado.");
        }
    }


    private static void crearPedido() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese nombre del cliente: ");
        String cliente = sc.nextLine();

        System.out.print("Ingrese producto: ");
        String producto = sc.nextLine();

        System.out.println("Pedido creado para " + cliente + " con producto: " + producto);
    }


    private static void listarPedidos() {

    ArrayList<Pedido> pedidos = new ArrayList<>();

  public static void main(String[] args){
        crearPedido();   // crear un pedidos
        listarPedidos(); // mostrar pedidos
    }

    private static void crearPedido() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese nombre del cliente: ");
        String cliente = sc.nextLine();

        System.out.print("¿Cuántos productos desea agregar? ");
        int cantidad = sc.nextInt();
        sc.nextLine(); // limpiar buffer

        String[] productos = new String[cantidad];
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Producto #" + (i + 1) + ": ");
            productos[i] = sc.nextLine();
        }

        Pedido nuevoPedido = new Pedido(cliente, productos);
        pedidos.add(nuevoPedido);
    }

    private static void listarPedidos() {
        if (pedidos.isEmpty()) {
            System.out.println("No hay pedidos registrados.");
            return;
        }

        System.out.println("\n--- Lista de Pedidos ---");
        for (int i = 0; i < pedidos.size(); i++) {
            Pedido p = pedidos.get(i);
            System.out.println("Pedido #" + (i + 1) + " - Cliente: " + p.cliente);
            for (String producto : p.productos) {
                System.out.println("  - " + producto);
            }
        }
    }
}
















