package inventario;

public class SistemaInventario {
    public static void main(String[] args) {
        PeticionesProducto accion = new PeticionesProducto();
        controladorInventario menu = new controladorInventario(accion);
        menu.MenuPrincipalfuncional();
    }
}
