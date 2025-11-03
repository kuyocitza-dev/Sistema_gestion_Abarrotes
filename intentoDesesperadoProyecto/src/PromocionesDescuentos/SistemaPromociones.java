package PromocionesDescuentos;

import inventario.Producto;

import java.time.LocalDate;

public class SistemaPromociones {
    public static void main(String[] args) {
        ejecucionPromociones();
    }
    public static void ejecucionPromociones(){
        // Se crean dos productos de ejemplo
        Producto arroz = new Producto("Arroz 1kg", 25);
        Producto frijol = new Producto("Frijol 1kg", 30);

        // Se crea una promoción válida en el mes de octubre
        Promocion promoVerano = new Promocion("Promoción de Verano", 15,
                LocalDate.of(2025, 10, 1), // Fecha de inicio
                LocalDate.of(2025, 10, 31)); // Fecha de fin

        // Se crea un gestor que administrará las promociones
        GestorPromociones gestor = new GestorPromociones();

        // Se agrega la promoción a la lista de promociones del gestor
        gestor.agregarPromocion(promoVerano);

        // Se aplican las promociones a los productos
        gestor.aplicarPromocion(arroz, promoVerano);
        gestor.aplicarPromocion(frijol, promoVerano);

        // Se muestra la información completa de los productos
        System.out.println("\n--- Información de productos ---");
        arroz.mostrarInfo();
        frijol.mostrarInfo();
    }
}
