package inventario;

import java.util.ArrayList;
import java.util.Scanner;

public class controladorInventario {
    Producto producto;
    PeticionesProducto Accion;
    Scanner lectura = new Scanner(System.in);
    ArrayList<Producto> listaProducto = new ArrayList<>();

    public controladorInventario(PeticionesProducto accion) {
        this.Accion = accion;
    }

    public int MenuPricipal(){
        System.out.println("/t/t Gestion de inventario");
        System.out.println("1- Agregar producto");
        System.out.println("2- Actualizar producto");
        System.out.println("3- eliminar producto");
        System.out.println("4- mostrar datos guardados");
        System.out.println("5- Salir del menu");
        System.out.println("Elija una opcion: ");
        return lectura.nextInt();
    }
    public void MenuPrincipalfuncional(){
        int opciones = 0;
        while (opciones != 5){
            switch (MenuPricipal()){
                case 1:
                    aniadirProducto();
                    break;
                case 2:
                    modificarNombre(Accion.SolicitarNombre());
                    Accion.imprimirInfoTotal(listaProducto);
                    break;
                case 3:
                    eliminarProducto(Accion.SolicitarNombre());
                    Accion.imprimirInfoTotal(listaProducto);
                    break;
                case 4:
                    Accion.imprimirInfoTotal(listaProducto);
                    break;
                case 5:
                    opciones = 5;
                    break;
            }
        }
    }

    public int buscarAsignatura(String clave){
        for (int i = 0; i < listaProducto.size(); i++) {
            if (clave.equals(listaProducto.get(i).getNombre())){
                return i;
            }
        }
        return -1;
    }
    public void aniadirProducto(){
        producto = new Producto(Accion.SolicitarNombre(), Accion.SolicitarDescripcion(), Accion.SolicitarCodigo(), Accion.SolicitarProveedor(), Accion.SolicitarFechaVencimiento(), Accion.SolicitarPrecio(), Accion.SolicitarCantidadInicial());
        listaProducto.add(producto);
    }
    public void eliminarProducto(String clave){
        int indice = buscarAsignatura(clave);
        if(indice != -1){
            listaProducto.remove(indice);
        }
    }

    public void modificarNombre(String clave){
        int indice = buscarAsignatura(clave);
        if (indice != -1){
            listaProducto.get(indice).setNombre(Accion.SolicitarNuevoNombre());
        }
    }
}
