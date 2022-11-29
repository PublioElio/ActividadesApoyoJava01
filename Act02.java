package actividades.apoyo;

/* importamos la librería Scanner para poder solicitar al usuario
entrada por consola */
import java.util.Scanner; 

/**
 * Este programa solicita que se introduzca la edad, nombre y apellidos por
 * consola y después lo muestra
 *
 * @author Adriano Díaz <Adriano.Díaz>
 */
public class Act02 {

    public static void main(String[] args) {
        String nombre, apellidos;
        int edad;
        /* declaramos un nuevo objeto Scanner */
        Scanner teclado = new Scanner(System.in); 

        System.out.println("Introduzca su edad: ");
        edad = teclado.nextInt();

        teclado.nextLine(); // limpiamos el buffer de teclado

        System.out.println("Introduzca nombre y apellidos: ");
        /* cuando pulse la barra espaciadora guardamos los apellidos */
        nombre = teclado.next();
        apellidos = teclado.nextLine();
        
        /* se ha usado el carácter de escape '\n' para incluir saltos de línea 
        en las cadenas de texto */
        System.out.println("Nombre: " + nombre + "\nApellidos:"
                + apellidos + "\nEdad: " + edad); 

    }

}
