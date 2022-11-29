package actividades.apoyo;

/**
 * Este programa imprime en pantalla la frase '¡Hola, mundo!' y luego muestra la
 * versión de Java instalada en el equipo
 *
 * @author Adriano Díaz <Adriano.Díaz>
 */
public class Act01 {

    public static void main(String[] args) {
        System.out.println("¡Hola, mundo!");
        System.out.println("La versión de Java instalada en mi equipo es: "
                + System.getProperty("java.version"));
    }

}
