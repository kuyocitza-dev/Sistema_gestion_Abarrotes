package clientes;

import java.util.ArrayList;
import java.util.Scanner;

public class ControladorClientes {
    Cliente cliente;
    PeticionCliente peticiones = new PeticionCliente();
    Scanner lectura = new Scanner(System.in);
    ArrayList<Cliente>listaClientes = new ArrayList<>();

    public ControladorClientes(PeticionCliente peticiones) {
        this.peticiones = peticiones;
    }

    public int MenuPricipal(){
        System.out.println("/t/t Gestion de cliente");
        System.out.println("1- Agregar cliente");
        System.out.println("2- Actualizar cliente");
        System.out.println("3- eliminar cliente");
        System.out.println("4- mostrar datos guardados");
        System.out.println("5- aplicar descuento");
        System.out.println("6- Salir del menu");
        System.out.println("Elija una opcion: ");
        return lectura.nextInt();
    }

    public void menuFuncional(){
        int opcion = 0;
        while (opcion != 6){
            switch (MenuPricipal()){
                case 1: //agregar
                    agregarCliente();
                    break;
                case 2: //actualizarCliente
                    actualizarCliente(peticiones.pedirNombre());
                    peticiones.imprimirInfoTotal(listaClientes);
                    break;
                case 3://eliminar
                    eliminarCliente(peticiones.pedirNombre());
                    break;
                case 4: // mostrar lista
                    peticiones.imprimirInfoTotal(listaClientes);
                    break;
                case 5: //aplicar descuente
                    aplicarDescuento(peticiones.pedirClienteAmigo());
                    break;
                case  6:
                    opcion = 6;
                    break;
            }
        }
    }

    public int buscarCliente(String clave){
        for (int i =0 ; i<listaClientes.size(); i++){
            if (clave.equals(listaClientes.get(i).getNombre())){
                return i;
            }
        }
        return -1;
    }

    public int buscarAplicacionDescuento(String clave){
        for (int i = 0; i < listaClientes.size(); i++) {
             if (clave.equals(listaClientes.get(i).getClienteAmigo())){
                 return i;
             }
        }
        return -1;
    }

    public void agregarCliente(){
        cliente = new Cliente(peticiones.pedirNombre(), peticiones.pedirDireccion(), peticiones.pedirTelefono(), peticiones.pedirTelefono());
        listaClientes.add(cliente);
    }

    public void actualizarCliente(String clave){
        int indice = buscarCliente(clave);
        if (indice != -1){
            listaClientes.get(indice).setNombre(peticiones.pedirNuevoNombre());
        }
    }
    public void eliminarCliente(String clave){
        int indice = buscarCliente(clave);
        if (indice != -1){
            listaClientes.remove(indice);
        }
    }

    public  void aplicarDescuento(String clave){
        int indice = buscarAplicacionDescuento(clave);
        if (indice != -1){
            System.out.println("el cliente " + listaClientes.get(indice).getNombre() + "a sido agregado al programa de descuenetos");
            //hacer algo con la clase promocion o agregar estos cliente a esa clase.
        }
    }

}
