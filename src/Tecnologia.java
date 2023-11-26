import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Tecnologia extends Producto{
    private String sitemaOperativo;
    private int memoriaRam;
    private String procesador;
    private int memoriaAlmacenamiento;

    public Tecnologia(String nombre, double precio, String codigo,
                      int cantidad, String marca, String sitemaOperativo,
                      int memoriaRam, String procesador, int memoriaAlmacenamiento) {
        super(nombre, precio, codigo, cantidad, marca);
        this.sitemaOperativo = sitemaOperativo;
        this.memoriaRam = memoriaRam;
        this.procesador = procesador;
        this.memoriaAlmacenamiento = memoriaAlmacenamiento;
    }

    public Tecnologia() {
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
        System.out.println("Ingrese el sistema operativo del producto");
        this.sitemaOperativo=sc.next();
        System.out.println("Ingrese la capacidad de memoria RAM del producto");
        this.memoriaRam=sc.nextInt();
        System.out.println("Ingrese la marca del procesador del producto");
        this.procesador=sc.next();
        System.out.println("Ingrese la capacidad de memoria de almacenamiento del producto");
        this.memoriaAlmacenamiento=sc.nextInt();
    }

    public void mostrarInventarioTecnologia(Inventario inventario) {
        List<Producto> productosTecnologia = inventario.getProductosPorTipo(Tecnologia.class);
        System.out.println("Inventario de Productos de Tecnología:");
        for (Producto producto : productosTecnologia) {
            System.out.println(producto);
        }
    }


    public String getSitemaOperativo() {
        return sitemaOperativo;
    }

    public void setSitemaOperativo(String sitemaOperativo) {
        this.sitemaOperativo = sitemaOperativo;
    }

    public int getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(int memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public int getMemoriaAlmacenamiento() {
        return memoriaAlmacenamiento;
    }

    public void setMemoriaAlmacenamiento(int memoriaAlmacenamiento) {
        this.memoriaAlmacenamiento = memoriaAlmacenamiento;

    }

    public String toString() {

        return "----TECNOLOGIA----"+"\nProducto: " + nombre +"\nPrecio: "+precio+
                "\nCodigo: "+codigo+ "\nCantidad: " +cantidad+
                "\nMarca: "+marca+"\nSitema Operativo: "+sitemaOperativo+
                "\nMemoria Ram: "+memoriaRam+"\nProcesador: " +procesador+
                "\nMemoria Almacenamiento: "+memoriaAlmacenamiento;
    }
}
