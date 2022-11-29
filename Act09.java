package actividades.apoyo;

import java.util.Locale;
import java.util.Scanner;

/**
 * Este programa solicita un número decimal y lo muestra redondeado
 *
 * @author Adriano Díaz <Adriano.Díaz>
 */
public class Act09 {

    public static void main(String[] args) {
        double num;
        long redondeo;
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US); // así usamos punto en vez de coma para los decimales
        System.out.println("Introduzca un número decimal usando punto para "
                + "separar la parte entera de la decimal: ");
        num = sc.nextDouble();
        redondeo = Math.round(num); // esta es una forma de redondear
        System.out.println("Número redondeado: " + redondeo);
        num += 0.5;
        System.out.println("\nSolución alternativa, casteando:\n"
                + "----------------------------------------------------------\n"
                + "Número decimal redondeado: " + (int) num);
    }
}
