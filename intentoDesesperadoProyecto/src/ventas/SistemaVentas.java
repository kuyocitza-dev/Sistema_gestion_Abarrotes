package ventas;
import clientes.Cliente;
import inventario.Producto;
import java.util.ArrayList;
import java.util.Scanner;

public class SistemaVentas {
    private static GestorClientes gestorClientes = new GestorClientes();
    private static ArrayList<Venta> ventas = new ArrayList<>();

    public static void main(String[] args) {
        ejecucionVentas();

    }

    public  static void ejecucionVentas(){
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n SISTEMA DE GESTIÓN DE ABARROTES");
            System.out.println("1. Registrar cliente");
            System.out.println("2. Buscar cliente");
            System.out.println("3. Registrar venta");
            System.out.println("4. Listar clientes");
            System.out.println("5. Listar ventas");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1 -> registrarCliente(sc);
                case 2 -> buscarCliente(sc);
                case 3 -> registrarVenta(sc);
                case 4 -> gestorClientes.listarClientes();
                case 5 -> listarVentas();
                case 0 -> System.out.println("Saliendo del sistema...");
                default -> System.out.println("Opción no válida.");
            }
        } while (opcion != 0);
    }

    private static void registrarCliente(Scanner sc) {
        System.out.print("Código de cliente: ");
        String codigo = sc.nextLine();
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Dirección: ");
        String direccion = sc.nextLine();
        System.out.print("Teléfono: ");
        String telefono = sc.nextLine();

        Cliente cliente = new Cliente(nombre, direccion, telefono, codigo);
        gestorClientes.registrarCliente(cliente);
    }

    private static void buscarCliente(Scanner sc) {
        System.out.print("Ingrese código de cliente: ");
        String codigo = sc.nextLine();
        Cliente c = gestorClientes.buscarCliente(codigo);

        if (c != null) {
            System.out.println("Cliente encontrado: " + c);
        } else {
            System.out.println("Cliente no encontrado.");
        }
    }

    private static void registrarVenta(Scanner sc) {
        System.out.print("Código del cliente: ");
        String codigo = sc.nextLine();

        Cliente cliente = gestorClientes.buscarCliente(codigo);
        if (cliente == null) {
            System.out.println("El cliente no existe. Regístrelo primero.");
            return;
        }

        Venta venta = new Venta(codigo);

        boolean agregarMas = true;
        while (agregarMas) {
            System.out.println("\n AGREGAR PRODUCTO A LA VENTA ");
            System.out.print("Nombre del producto: ");
            String nombre = sc.nextLine();

            System.out.print("Precio unitario: ");
            double precio = sc.nextDouble();

            System.out.print("Cantidad: ");
            int cantidad = sc.nextInt();
            sc.nextLine();

            Producto p = new Producto(nombre, precio, cantidad);
            venta.agregarProducto(p);

            System.out.print("¿Desea agregar otro producto? (s/n): ");
            String respuesta = sc.nextLine();
            if (respuesta.equalsIgnoreCase("n")) {
                agregarMas = false;
            }
        }

        ventas.add(venta);
        System.out.println("\n Venta registrada correctamente:");
        System.out.println(venta);
    }

    private static void listarVentas() {
        System.out.println("\n LISTA DE VENTAS");
        if (ventas.isEmpty()) {
            System.out.println("No hay ventas registradas.");
        } else {
            for (Venta v : ventas) {
                System.out.println(v);

            }
        }
    }
}
