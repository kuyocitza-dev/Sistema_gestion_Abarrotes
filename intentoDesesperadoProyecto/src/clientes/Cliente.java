package clientes;

public class Cliente {
    private String nombre, direccion, telefono, clienteAmigo;

    public Cliente() {
    }

    public Cliente(String nombre, String direccion, String telefono, String clienteAmigo) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.clienteAmigo = clienteAmigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClienteAmigo() {
        return clienteAmigo;
    }

    public void setClienteAmigo(String clienteAmigo) {
        this.clienteAmigo = clienteAmigo;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", clienteAmigo='" + clienteAmigo + '\'' +
                '}';
    }
}
