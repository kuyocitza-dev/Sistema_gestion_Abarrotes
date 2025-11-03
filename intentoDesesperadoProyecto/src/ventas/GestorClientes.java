package ventas;

import clientes.Cliente;

import java.util.ArrayList;

public class GestorClientes {
    private ArrayList<Cliente> clientes = new ArrayList<>();

    public void registrarCliente(Cliente cliente) {
        clientes.add(cliente);
        System.out.println("Cliente registrado correctamente: " + cliente.getNombre());
    }

    public Cliente buscarCliente(String codigo) {
        for (Cliente c : clientes) {
            if (c.getcodigoCliente().equalsIgnoreCase(codigo)) {
                return c;
            }
        }
        return null;
    }

    public void listarClientes() {
        System.out.println("\n=== LISTA DE CLIENTES ===");
        if (clientes.isEmpty()) {
            System.out.println("No hay clientes registrados.");
        } else {
            for (Cliente c : clientes) {
                System.out.println(c);
            }
        }
    }
}
