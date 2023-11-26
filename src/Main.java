import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Producto> listaProductos = new ArrayList<>();
        Inventario inventario = new Inventario(listaProductos);

        Interface.ejecutarInterfaz(inventario);
    }
}
