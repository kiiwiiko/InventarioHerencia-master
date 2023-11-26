import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Alimento extends Producto{

    private String fechaElaboracion;
    private String fechaExpiracion;

    private List<String> ingredientes = new ArrayList<>();

    public Alimento(String nombre, double precio, String codigo, int cantidad,
                    String marca, String fechaElaboracion, String fechaExpiracion,
                    List<String> ingredientes) {
        super(nombre, precio, codigo, cantidad, marca);
        this.fechaElaboracion = fechaElaboracion;
        this.fechaExpiracion = fechaExpiracion;
        this.ingredientes = ingredientes;
    }

    public Alimento() {
    }
    @Override
    public void ingresarProducto(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del producto");
        this.nombre=sc.next();
        System.out.println("Ingrese el precio del producto");
        this.precio=sc.nextDouble();
        System.out.println("Ingrese el código del producto");
        this.codigo=sc.next();
        System.out.println("Ingrese el cantidad del producto");
        this.cantidad=sc.nextInt();
        System.out.println("Ingrese marca del producto");
        this.marca=sc.next();
        System.out.println("Ingrese fecha de elaboración del producto");
        this.fechaElaboracion=sc.next();
        System.out.println("Ingrese fecha de expiración del producto");
        this.fechaExpiracion=sc.next();
    }


    public void mostrarInventarioAliemto(Inventario inventario) {
        List<Producto> productosAlimento = inventario.getProductosPorTipo(Alimento.class);
        System.out.println("Inventario de Productos de Alimento:");
        for (Producto producto : productosAlimento) {
            System.out.println(producto);
        }
    }




    public String getFechaElaboracion() {
        return fechaElaboracion;
    }

    public void setFechaElaboracion(String fechaElaboracion) {
        this.fechaElaboracion = fechaElaboracion;
    }

    public String getFechaExpiracion() {
        return fechaExpiracion;
    }

    public void setFechaExpiracion(String fechaExpiracion) {
        this.fechaExpiracion = fechaExpiracion;
    }

    public List<String> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<String> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public String toString() {

        return "----ALIMENTO----"+"\nProducto: " + nombre +"\nPrecio: "+precio+
                "\nCodigo: "+codigo+ "\nCantidad: " +cantidad+
                "\nMarca: "+marca+"\nFecha Elavoracion: "+fechaElaboracion+
                "\nFecha Vencimiento: "+fechaExpiracion;
    }
}
