public class Producto {
    private String nombre;
    private double precioUnitario;
    private int cantidad;

    public Producto(String nombre, double precioUnitario, int cantidad) {
        this.nombre = nombre;
        this.precioUnitario = precioUnitario;
        this.cantidad = cantidad;
    }

    public String getNombre() { return nombre; }
    public double getPrecioUnitario() { return precioUnitario; }
    public int getCantidad() { return cantidad; }

    public double getSubtotal() {
        return precioUnitario * cantidad;
    }

    @Override
    public String toString() {
        return cantidad + " x " + nombre + " @ $" + precioUnitario + " = $" + getSubtotal();
    }
}
