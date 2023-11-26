import java.util.ArrayList;
import java.util.List;

public class Inventario {
    private List<Producto> productos;

    public Inventario(List<Producto> productos) {
        this.productos = productos;
    }

    public List<Producto> getProductosPorTipo(Class<?> tipoProducto) {
        List<Producto> productosPorTipo = new ArrayList<>();
        for (Producto producto : productos) {
            if (tipoProducto.isInstance(producto)) {
                productosPorTipo.add(producto);
            }
        }
        return productosPorTipo;
    }
    public boolean productoRepetido(String nombreProducto) {
        for (Producto producto : productos) {
            if (producto.getNombre().equalsIgnoreCase(nombreProducto)) {
                return true; // El producto está repetido
            }
        }
        return false; // El producto no está repetido
    }

    public void agregarProducto(Producto producto) {
        if (!productoRepetido(producto.getNombre())) {
            productos.add(producto);
            System.out.println("Producto agregado correctamente.");
        } else {
            System.out.println("Error: El producto ya existe en el inventario.");
        }
    }

    public void mostrarInventario() {
        System.out.println("Inventario:");
        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }
}