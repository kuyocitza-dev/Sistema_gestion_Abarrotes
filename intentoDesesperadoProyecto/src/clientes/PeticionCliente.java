package clientes;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Esta clase se encarga de solicitar los datos al usuario
 *@author Alan Jesus Kuyoc Itza
 * @version 1.0
 */
public class PeticionCliente {
    Scanner lectura = new Scanner(System.in);

    public String pedirNombre(){
        System.out.println("Nombre del cliente:");
        return lectura.next();
    }

    public String pedirDireccion(){
        System.out.println("direccion del cliente: ");
        return lectura.next();
    }

    public String pedirTelefono(){
        System.out.println("Numero de telefono del cliente: ");
        return lectura.next();
    }

    public String pedirClienteAmigo(){
        System.out.println("clienteAmigo del cliente: ");
        return lectura.next();
    }

    public String pedirNuevoNombre() {
        System.out.println("nuevo nombre del cliente: ");
        return lectura.next();
    }

    /**
     * Esta funcion es l unica que no solicita datos, esta los imprime
     * @param Listaproducto necesaria para mostrar todos los clientes
     */
    public void imprimirInfoTotal(ArrayList<Cliente> Listaproducto){
        Listaproducto.forEach(System.out::println);
    }
}
