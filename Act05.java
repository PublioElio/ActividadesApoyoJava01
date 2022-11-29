package actividades.apoyo;

import java.util.Scanner;

/**
 * Este programa solicita que introduzcan el radio de una circunferencia, luego
 * calcula la circunferencia y el área
 *
 * @author Adriano Díaz <Adriano.Díaz>
 */
public class Act05 {

    public static void main(String[] args) {
        double cir, radio, area;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el radio de la circunferencia: ");
        radio = sc.nextDouble();
        cir = 2 * (Math.PI * radio);
        area = Math.PI * Math.pow(radio, 2);
        System.out.printf("Circunferencia: %,.2f \tÁrea: %,.2f\n",
                cir, area);
    }

}
