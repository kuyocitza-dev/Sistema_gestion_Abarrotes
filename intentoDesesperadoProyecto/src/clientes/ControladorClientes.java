package clientes;

import java.util.ArrayList;
import java.util.Scanner;
/**
 * Desde esta clase se maneja el menu principal para la clase clientes.
 * esta clase es la que le da funcionionalidd al menu, permite hacer todad las acciones de un CRUD
 *@author Alan Jesus Kuyoc Itza
 * @version 1.0
 */
public class ControladorClientes {

    Cliente cliente;
    PeticionCliente peticiones = new PeticionCliente();
    Scanner lectura = new Scanner(System.in);
    ArrayList<Cliente>listaClientes = new ArrayList<>();

    public ControladorClientes(PeticionCliente peticiones) {
        this.peticiones = peticiones;
    }

    /**
     * este metodo solo muestra las distintas opciones que se pueden hacer
     * @return int - envia el dato capturado a el metodo que le dara un uso
     */
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

    /**
     * este es la funcion principal es la que permite hacer todas la acciones.
     */
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

    /**
     * esta función es de apoyo para poder eliminar y actualizar datos del cliente.
     * Se encarga de encontrar al cliente solicitado entre todo el arreglo
     * @param clave resive cualquier atributo, ya sea nombre, dirreccion, y asi, esto para dar opciones de busqueda
     * @return int retorna el indice en donde se encuentra el cliente soliciatado, si no lo encuentra devuelve un -1 como control
     */
    public int buscarCliente(String clave){
        for (int i =0 ; i<listaClientes.size(); i++){
            if (clave.equals(listaClientes.get(i).getNombre())){
                return i;
            }
        }
        return -1;
    }

    /**
     *funcion especialmente para buscar por codigoCliente, hace lo mismo que el metodo anterior.
     * <ul>
     *     <li> unificarlo con la funcion buscar clientes</li>
     * </ul>
     */
    public int buscarAplicacionDescuento(String clave){
        for (int i = 0; i < listaClientes.size(); i++) {
             if (clave.equals(listaClientes.get(i).getcodigoCliente())){
                 return i;
             }
        }
        return -1;
    }

    /**
     * funcion que solo agregrega clientes al arreglo
     */
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

    /**
     * se encarga de subir al cliente seleccionado a una lista de cliente socios, estos clientes son los que reciviran los descuentos
     * @param clave recibe solo al atributo codigoCliente
     */
    public  void aplicarDescuento(String clave){
        int indice = buscarAplicacionDescuento(clave);
        if (indice != -1){
            System.out.println("el cliente " + listaClientes.get(indice).getNombre() + "a sido agregado al programa de descuenetos");
            //hacer algo con la clase promocion o agregar estos cliente a esa clase.
        }
    }

}
