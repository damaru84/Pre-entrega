public class Producto {
    private static int idSiguiente = 0;
    int id;
    String nombre;
    double precio;
    int stock;

    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }
    }
    // constructor
public Producto() {
this.id = Producto.idSiguiente;
Producto.idSiguiente++;
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
    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int stock() {
        return stock;
    }

}

public void main() {
}

public void main() {
}

