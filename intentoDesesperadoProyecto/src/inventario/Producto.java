package inventario;

import PromocionesDescuentos.Promocion;

public class Producto {
    private String nombre, descripcion, codigo, proveedor,fechavencimiento;
    private float precio, cantidadInicial;
    private Promocion promocion;//utilizado en gestionPromociones
    //utilizado en clase ventas
    private double precioUnitario;
    private int cantidad;

    public Producto(){}

    public Producto(String nombre, int precio) { //utilizado en promociones
        this.nombre = nombre;
        this.precio = precio;
    }

    public Producto(String nombre, double precioUnitario, int cantidad) { //utilizado en Ventas
        this.nombre = nombre;
        this.precioUnitario = precioUnitario;
        this.cantidad = cantidad;
    }

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

    public Promocion getPromocion() {
        return promocion;
    }

    public void setPromocion(Promocion promocion) {
        this.promocion = promocion;
    }

    public float getPrecio() {
        return precio;
    }

    //utilizado en ventas
    public double getPrecioUnitario() { return precioUnitario; }
    public int getCantidad() { return cantidad; }

    public double getSubtotal() {
        return precioUnitario * cantidad;
    }

    //utilizado en el main de promociones

    // Calcula el precio con descuento si hay una promoción activa
    public double getPrecioConDescuento() {
        // Si hay una promoción y está activa, aplica el descuento
        if (promocion != null && promocion.estaActiva()) {
            return precio - (precio * promocion.getPorcentajeDescuento() / 100);
        }
        // Si no hay promoción o no está activa, devuelve el precio normal
        return precio;
    }

    // Muestra la información completa del producto
    public void mostrarInfo() {
        System.out.println("Producto: " + nombre);
        System.out.println("Precio base: $" + precio);
        // Si el producto tiene una promoción activa, la muestra
        if (promocion != null && promocion.estaActiva()) {
            System.out.println("Descuento: " + promocion.getPorcentajeDescuento() + "%");
            System.out.println("Precio con descuento: $" + getPrecioConDescuento());
        }
        System.out.println();
    }
    //


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
