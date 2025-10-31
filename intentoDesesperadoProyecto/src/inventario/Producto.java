package inventario;

public class Producto {
    private String nombre, descripcion, codigo, proveedor,fechavencimiento;
    private float precio, cantidadInicial;

    public Producto(){}

    public Producto(String nombre, String descripcion, String codigo, String proveedor, String fechavencimiento, float precio, float cantidadInicial) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.codigo = codigo;
        this.proveedor = proveedor;
        this.fechavencimiento = fechavencimiento;
        this.precio = precio;
        this.cantidadInicial = cantidadInicial;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", codigo='" + codigo + '\'' +
                ", proveedor='" + proveedor + '\'' +
                ", fechavencimiento='" + fechavencimiento + '\'' +
                ", precio=" + precio +
                ", cantidadInicial=" + cantidadInicial +
                '}';
    }
}
