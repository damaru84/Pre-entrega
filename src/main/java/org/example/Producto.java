public class Producto {
    String nombre;
    double precio;
    int stock;

    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public boolean contieneNombre(String busqueda) {
        return this.nombre.toLowerCase().contains(busqueda.toLowerCase());
    }

    public void print() {
        System.out.println("Nombre: " + nombre + " | Precio: " + precio + " | Stock: " + stock);
    }

    public void actualizar(String nuevoNombre, double nuevoPrecio, int nuevoStock) {
        this.nombre = nuevoNombre;
        this.precio = nuevoPrecio;
        this.stock = nuevoStock;
    }
}