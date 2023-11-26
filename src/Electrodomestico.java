import java.util.List;
import java.util.Scanner;

public class Electrodomestico extends Producto{

    private int vidaUtilAnios;
    private  String sitioFabricacion;
    private double voltajeAlimentacion;
    private String garantia;

    public Electrodomestico(String nombre, double precio, String codigo, int cantidad,
                            String marca, int vidaUtilAnios, String sitioFabricacion,
                            double voltajeAlimentacion, String garantia) {
        super(nombre, precio, codigo, cantidad, marca);
        this.vidaUtilAnios = vidaUtilAnios;
        this.sitioFabricacion = sitioFabricacion;
        this.voltajeAlimentacion = voltajeAlimentacion;
        this.garantia = garantia;
    }

    public Electrodomestico() {
    }

    public double intervaloMantenimiento() {
        double intervalo = vidaUtilAnios/5;
        return intervalo;
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
        System.out.println("Ingrese los años de utilidad del producto");
        this.vidaUtilAnios=sc.nextInt();
        System.out.println("Ingrese el sitio de fabricacion del producto");
        this.sitioFabricacion=sc.next();
        System.out.println("Ingrese el voltaje de alimentacion del producto");
        this.voltajeAlimentacion=sc.nextDouble();
        System.out.println("Ingrese la garantia del producto");
        this.garantia=sc.next();
    }



    public void mostrarInventarioElectrodomestico(Inventario inventario) {
        List<Producto> productosElectrodomestico = inventario.getProductosPorTipo(Tecnologia.class);
        System.out.println("Inventario de Productos de Electrodomestico:");
        for (Producto producto : productosElectrodomestico) {
            System.out.println(producto);
        }
    }


    public int getVidaUtilAnios() {
        return vidaUtilAnios;
    }

    public void setVidaUtilAnios(int vidaUtilAnios) {
        this.vidaUtilAnios = vidaUtilAnios;
    }

    public String getSitioFabricacion() {
        return sitioFabricacion;
    }

    public void setSitioFabricacion(String sitioFabricacion) {
        this.sitioFabricacion = sitioFabricacion;
    }

    public double getVoltajeAlimentacion() {
        return voltajeAlimentacion;
    }

    public void setVoltajeAlimentacion(double voltajeAlimentacion) {
        this.voltajeAlimentacion = voltajeAlimentacion;
    }

    public String getGarantia() {
        return garantia;
    }


    public void setGarantia(String garantia) {
        this.garantia = garantia;
    }

    public String toString() {
        return "----ELECTRODOMESTICO----"+"\nProducto: " + nombre +"\nPrecio: "+precio+
                "\nCodigo: "+codigo+ "\nCantidad: " +cantidad+
                "\nMarca: "+marca+"\nVida Util: "+vidaUtilAnios+
                "\nSitio de Fabricacion: "+sitioFabricacion+"\nVoltaje de alimentacion: : " +voltajeAlimentacion+
                "\nGarantia: "+garantia;
    }

}
