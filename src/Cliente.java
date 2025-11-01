public class Cliente {
    private String codigoCliente;
    private String nombre;
    private String direccion;
    private String telefono;

    public Cliente(String codigoCliente, String nombre, String direccion, String telefono) {
        this.codigoCliente = codigoCliente;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getCodigoCliente() { return codigoCliente; }
    public String getNombre() { return nombre; }
    public String getDireccion() { return direccion; }
    public String getTelefono() { return telefono; }

    @Override
    public String toString() {
        return "[" + codigoCliente + "] " + nombre + " - " + telefono;
    }
}
