package actividades.apoyo;

import java.time.Year;
import java.util.Scanner;

/**
 * Este programa pregunta un año de nacimiento y le dice la edad actual al
 * usuario, la edad que tendrá el año que viene, además de confirmale si es
 * adulto o no
 *
 * @author Adriano Díaz <Adriano.Díaz>
 */
public class Act04 {

    public static void main(String[] args) {
        int edad, nacimiento;
        boolean esAdulto;
        /* para obtener el año actual del sistema */
        int anyoActual = Year.now().getValue();
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor, introduce tu año de nacimiento: ");
        nacimiento = sc.nextInt();
        edad = anyoActual - nacimiento;
        System.out.println("Ahora tienes " + edad + " años.");
        edad++;
        System.out.println("El año que viene, tendrás "
                + edad + " años");
        esAdulto = edad >= 18;
        if (esAdulto) {
            System.out.println("Has alcanzado la mayoría de edad.");
        } else {
            System.out.println("Aún no eres mayor de edad.");
        }
    }

}
