package sistemaGestionAbarrotes;
import PromocionesDescuentos.SistemaPromociones;
import clientes.ControladorClientes;
import clientes.PeticionCliente;
import inventario.PeticionesProducto;
import inventario.controladorInventario;
import ventas.SistemaVentas;

import java.util.Scanner;


public class SistemaGestionAbarrotes {
    public static void main(String[] args) {
        controladorMenu();
    }

    public static int menu(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("\t\tElige una opcion");
        System.out.println("1- Gestion de inventario.");
        System.out.println("2- Registro de ventas.");
        System.out.println("3- Busqueda y consulta de Productos");
        System.out.println("4- Gestion de clientes");
        System.out.println("5- Gestion de promociones y descuentos");
        System.out.println("6- Generacion de reportes");
        System.out.println("7- salir del sistema");
        System.out.println("Opción: ");
       return scanner.nextInt();

    }

    public static void controladorMenu(){
        int opcion = 0;
        while(opcion != 7){
            switch (menu()){
                case 1:
                    PeticionesProducto accion = new PeticionesProducto();
                    controladorInventario menu = new controladorInventario(accion);
                    menu.MenuPrincipalfuncional();
                    break;
                case 2:
                    SistemaVentas ventas = new SistemaVentas();
                    ventas.ejecucionVentas();
                    break;
                case 3://le falta
                    System.out.println("a un no disponible");
                    break;
                case 4:
                    PeticionCliente peticion = new PeticionCliente();
                    ControladorClientes menu1 = new ControladorClientes(peticion);
                    menu1.menuFuncional();
                    break;
                case 5:
                    SistemaPromociones promociones = new SistemaPromociones();
                    promociones.ejecucionPromociones();
                    break;
                case 6: //le falta
                    System.out.println("a un no disponible");
                    break;
                case 7:
                    opcion = 7;
                    break;
            }
        }
    }


}
