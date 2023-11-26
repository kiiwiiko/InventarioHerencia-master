import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
    class Interface {
        public static void ejecutarInterfaz(Inventario inventario) {
            Scanner scanner = new Scanner(System.in);
            int opcion;

            do {
                mostrarMenu();
                opcion = scanner.nextInt();
                scanner.nextLine(); // Limpiar el buffer

                switch (opcion) {
                    case 1:
                        System.out.println("Ha seleccionado ingresar un alimento.");
                        Alimento a1 = new Alimento();
                        a1.ingresarProducto();
                        inventario.agregarProducto(a1);
                        break;
                    case 2:
                        System.out.println("Ha seleccionado ingresar un electrodoméstico.");
                        Electrodomestico e1 = new Electrodomestico();
                        e1.ingresarProducto();
                        inventario.agregarProducto(e1);
                        break;
                    case 3:
                        System.out.println("Ha seleccionado ingresar un producto de tecnología.");
                        Tecnologia t1 = new Tecnologia();
                        t1.ingresarProducto();
                        inventario.agregarProducto(t1);
                        break;
                    case 4:
                        System.out.println("Mostrando inventario:");
                        inventario.mostrarInventario();
                        break;
                    case 5:
                        System.out.println("Saliendo del programa...");
                        break;
                    default:
                        System.out.println("Ingrese un número correcto.");
                        break;
                }
            } while (opcion != 5);

            scanner.close();
        }

        private static void mostrarMenu() {
            System.out.println("\nOpciones:");
            System.out.println("1. Ingresar un alimento");
            System.out.println("2. Ingresar un electrodoméstico");
            System.out.println("3. Ingresar un producto de tecnología");
            System.out.println("4. Mostrar inventario:");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
        }
    }