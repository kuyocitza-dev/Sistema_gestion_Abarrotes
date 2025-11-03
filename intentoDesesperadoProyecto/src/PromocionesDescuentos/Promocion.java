package PromocionesDescuentos;
import java.time.LocalDate;

public class Promocion {
    private String nombre;
    private double porcentajeDescuento;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;

    // Constructor para crear una promoción con nombre, descuento y fechas
    public Promocion(String nombre, double porcentajeDescuento, LocalDate fechaInicio, LocalDate fechaFin) {
        this.nombre = nombre;
        this.porcentajeDescuento = porcentajeDescuento;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    // Devuelve el porcentaje de descuento de la promoción
    public double getPorcentajeDescuento() { return porcentajeDescuento; }

    // Método que verifica si la promoción está activa según la fecha actual
    public boolean estaActiva() {
        LocalDate hoy = LocalDate.now();
        // Retorna true si la fecha actual está entre la fecha de inicio y fin
        return (hoy.isAfter(fechaInicio) || hoy.isEqual(fechaInicio)) &&
                (hoy.isBefore(fechaFin) || hoy.isEqual(fechaFin));
    }

    // Devuelve una descripción de la promoción
    @Override
    public String toString() {
        return nombre + " (" + porcentajeDescuento + "% de descuento)";
    }
}
