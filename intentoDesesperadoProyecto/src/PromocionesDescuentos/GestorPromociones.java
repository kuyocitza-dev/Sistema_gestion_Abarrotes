package PromocionesDescuentos;
import inventario.Producto;
import java.util.ArrayList;
import java.util.List;

public class GestorPromociones {
    private List<Promocion> promociones = new ArrayList<>(); // Lista para almacenar todas las promociones

    // Agrega una promoción nueva al sistema
    public void agregarPromocion(Promocion promo) {
        promociones.add(promo);
    }

    // Aplica una promoción a un producto, solo si está activa
    public void aplicarPromocion(Producto producto, Promocion promo) {
        if (promo.estaActiva()) {
            producto.setPromocion(promo);
            System.out.println("Promoción '" + promo + "' aplicada al producto: " + producto.getNombre());
        } else {
            System.out.println("La promoción '" + promo + "' no está activa.");
        }
    }
}
