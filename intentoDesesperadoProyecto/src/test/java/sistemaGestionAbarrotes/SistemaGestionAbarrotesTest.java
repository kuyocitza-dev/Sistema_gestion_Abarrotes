package test.java.sistemaGestionAbarrotes;
import org.junit.jupiter.api.*;
import sistemaGestionAbarrotes.SistemaGestionAbarrotes;
import java.io.*;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Clase de prueba unitaria para {@link SistemaGestionAbarrotes}.
 * descripcion:
 *   <li> Simula la entrada del usuario, verifica que el menú muestre opciones correctas y que el sistema salga sin errores. </li>
 * Se prueba:
 * <ul>
 *   <li>Que el menú imprime correctamente las opciones disponibles.</li>
 *   <li>Que el método menu() devuelve la opción seleccionada por el usuario.</li>
 *   <li>Que el método controladorMenu() puede ejecutarse y finalizar sin errores
 *       cuando se selecciona la opción de salir.</li>
 * </ul>
 *
 * <p><b>Requisitos:</b></p>
 * <ul>
 *   <li>JUnit 5 (org.junit.jupiter:junit-jupiter:5.x.x)</li>
 *   <li>Java 8 o superior</li>
 * </ul>
 *
 * <p>Autor: equipo<br>
 * Fecha: 2025-11-01</p>
 */
public class SistemaGestionAbarrotesTest {

    /** Almacena la salida original de la consola para restaurarla después del test. */
    private final PrintStream originalOut = System.out;

    /** Almacena la entrada original de la consola para restaurarla después del test. */
    private final InputStream originalIn = System.in;

    /** Flujo de bytes usado para capturar lo que imprime el programa en consola. */
    private ByteArrayOutputStream outContent;

    /**
     * Se ejecuta antes de cada prueba.
     * Redirige la salida estándar (System.out) a un flujo de memoria para poder analizarla.
     */
    @BeforeEach
    void setUpStreams() {
        outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
    }

    /**
     * Se ejecuta después de cada prueba.
     * Restaura los flujos originales de entrada y salida del sistema.
     */
    @AfterEach
    void restoreStreams() {
        System.setOut(originalOut);
        System.setIn(originalIn);
    }

    /**
     * Verifica que el menú principal imprime las opciones esperadas y devuelve
     * el número correcto cuando el usuario elige una opción.
     *
     * <p>Simula que el usuario ingresa "7" (salir del sistema) y analiza la
     * salida generada por el método {@link SistemaGestionAbarrotes#menu()}.</p>
     */
    @Test
    @DisplayName("Verifica que el menú muestra las opciones correctamente")
    void testMenuOutput() {
        // Simula la entrada del usuario: "7" + Enter
        String simulatedInput = "7\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        // Ejecuta el método y obtiene la opción elegida
        int opcion = SistemaGestionAbarrotes.menu();

        // Captura la salida impresa en consola
        String output = outContent.toString();

        // Muestra temporalmente el texto capturado (opcional)
        System.out.println("SALIDA CAPTURADA:\n" + output);

        // Verifica que el texto del menú contenga las opciones esperadas
        assertTrue(output.contains("Gestion de inventario"), "Debe contener la opción de inventario");
        assertTrue(output.contains("Gestion de clientes"), "Debe contener la opción de clientes");

        // Verifica que la opción retornada sea la ingresada
        assertEquals(7, opcion, "Debe devolver la opción 7 cuando el usuario ingresa 7");
    }

    /**
     * Verifica que el método {@link SistemaGestionAbarrotes#controladorMenu()}
     * pueda ejecutarse completamente sin arrojar excepciones cuando el usuario
     * elige la opción de salir ("7").
     *
     * <p>Esta prueba asegura que el sistema finaliza correctamente su bucle principal.</p>
     */
    @Test
    @DisplayName("Verifica que el sistema sale cuando se selecciona la opción 7")
    void testControladorMenuExit() {
        // Simula que el usuario elige 7 (salir)
        String simulatedInput = "7\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));

        // Comprueba que no se arrojen excepciones durante la ejecución
        assertDoesNotThrow(() -> SistemaGestionAbarrotes.controladorMenu(),
                "El sistema no debe lanzar excepciones al salir");
    }
}
