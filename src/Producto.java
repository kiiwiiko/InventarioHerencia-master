import java.util.Scanner;

public abstract class Producto {

    String nombre;
    double precio;
    String codigo;
    int cantidad;

    String marca;

    public Producto(String nombre, double precio, String codigo, int cantidad, String marca) {
        this.nombre = nombre;
        this.precio = precio;
        this.codigo = codigo;
        this.cantidad = cantidad;
        this.marca = marca;
    }

    public Producto() {
    }

    public void ingresarProducto() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del producto");
        this.nombre = sc.next();
        System.out.println("Ingrese el precio del producto");
        this.precio = sc.nextDouble();
        System.out.println("Ingrese el código del producto");
        this.codigo = sc.next();
        System.out.println("Ingrese el cantidad del producto");
        this.cantidad = sc.nextInt();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

}
