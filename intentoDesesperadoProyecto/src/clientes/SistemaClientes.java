package clientes;

/**
 * Desde esta clase se pone a prueba que funciona todo el package clente
 *@author Alan Jesus Kuyoc Itza
 * @version 1.0
 */
public class SistemaClientes {
    public static void main(String[] args) {
        PeticionCliente peticion = new PeticionCliente();
        ControladorClientes menu = new ControladorClientes(peticion);
        menu.menuFuncional();
    }
}
