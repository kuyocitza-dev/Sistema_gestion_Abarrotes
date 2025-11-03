package clientes;

/**
 * Esta es una de la clses principales del programa, con esta clase creamos los cliente
 * @author Alan Jesus Kuyoc Itza
 * @version 1.0
 */
public class Cliente {
    /***
     * los atributos son todos String ya que se considero que no se haran calculos aritmeticos con ellos
     */
    private String nombre, direccion, telefono, codigoCliente;

    /**
     * el constructor vacio a un que no se utiliza actualmente, se agrego para por si se necesita mas adelante
     */
    public Cliente() {
    }

    /**
     * Este constructos es el que se utiliza
     */
    public Cliente(String nombre, String direccion, String telefono, String codigoCliente) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.codigoCliente = codigoCliente;
    }

    /**
     *por el momento solo se estan usando estos getters y setters, ya que son los que realmente se usan
     */
    public String getNombre() {
        return nombre;
    }

    public String getcodigoCliente() {
        return codigoCliente;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setcodigoCliente(String clienteAmigo) {
        this.codigoCliente = clienteAmigo;
    }

    /**
     *Se sobre escribi el toString para mas control al mostrar los datos
     */
    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", clienteAmigo='" + codigoCliente + '\'' +
                '}';
    }
}
