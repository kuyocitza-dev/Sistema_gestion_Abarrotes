package inventario;

import java.util.ArrayList;
import java.util.Scanner;

public class PeticionesProducto {
    private Scanner lectura;

    public String SolicitarNombre(){
        System.out.println("nombre del producto: ");
        lectura = new Scanner(System.in);
        return lectura.next();
    }
    public String SolicitarDescripcion(){
        System.out.println("Descripción del producto: ");
        lectura = new Scanner(System.in);
        return lectura.nextLine();
    }
    public String SolicitarCodigo(){
        System.out.println("codigó del producto: ");
        lectura = new Scanner(System.in);
        return lectura.next();
    }
    public String SolicitarProveedor(){
        System.out.println("provedor del producto: ");
        lectura = new Scanner(System.in);
        return lectura.next();
    }
    public String SolicitarFechaVencimiento(){
        System.out.println("fecha de vencimiento del producto: ");
        lectura = new Scanner(System.in);
        return lectura.nextLine();
    }

    public int SolicitarPrecio(){
        System.out.println("precio del producto: ");
        lectura = new Scanner(System.in);
        return lectura.nextInt();
    }
    public int SolicitarCantidadInicial(){
        System.out.println("cantidad inicial del producto: ");
        lectura = new Scanner(System.in);
        return lectura.nextInt();
    }

    public void imprimirInfoTotal(ArrayList<Producto> Listaproducto){
        Listaproducto.forEach(System.out::println);
    }

    public String SolicitarNuevoNombre() {
        System.out.println("nuevo nombre del producto: ");
        lectura = new Scanner(System.in);
        return lectura.next();
    }
}
