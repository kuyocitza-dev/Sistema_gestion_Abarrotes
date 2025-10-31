package sistemaGestionAbarrotes;

import java.util.Scanner;


public class SistemaGestionAbarrotes {
    public static void main(String[] args) {
    }

    public int menu(){

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

    public void controladorMenu(){
        int opcion = 0;
        while(opcion != 7){
            switch (menu()){
                case 1: break;
                case 2: break;
                case 3: break;
                case 4: break;
                case 5: break;
                case 6: break;
            }
        }
    }


}
