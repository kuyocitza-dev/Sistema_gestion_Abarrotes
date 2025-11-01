import java.util.ArrayList;
import java.util.Date;

public class Venta {
    private String codigoCliente;
    private ArrayList<Producto> productos;
    private Date fecha;

    public Venta(String codigoCliente) {
        this.codigoCliente = codigoCliente;
        this.productos = new ArrayList<>();
        this.fecha = new Date();
    }

    public void agregarProducto(Producto p) {
        productos.add(p);
    }

    public double calcularTotal() {
        double total = 0;
        for (Producto p : productos) {
            total += p.getSubtotal();
        }
        return total;
    }

    public String getCodigoCliente() { return codigoCliente; }
    public ArrayList<Producto> getProductos() { return productos; }
    public Date getFecha() { return fecha; }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Venta a cliente [").append(codigoCliente)
                .append("] - Fecha: ").append(fecha).append("\n");

        for (Producto p : productos) {
            sb.append("   ").append(p).append("\n");
        }

        sb.append("TOTAL: $").append(calcularTotal());
        return sb.toString();
    }
}
