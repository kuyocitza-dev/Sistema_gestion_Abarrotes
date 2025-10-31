package clientes;

public class SistemaClientes {
    public static void main(String[] args) {
        PeticionCliente peticion = new PeticionCliente();
        ControladorClientes menu = new ControladorClientes(peticion);
        menu.menuFuncional();
    }
}
