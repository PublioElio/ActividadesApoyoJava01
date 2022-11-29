package actividades.apoyo;

import java.util.Scanner;

/**
 * Este programa pide dos notas por teclado y calcula la media aritmética
 *
 * @author Adriano Díaz <Adriano.Díaz>
 */
public class Act03 {

    public static void main(String[] args) {
        int nota1, nota2;
        double media; // la media puede contener decimales
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca la primera nota: ");
        nota1 = sc.nextInt();
        System.out.print("Introduzca la segunda nota: ");
        nota2 = sc.nextInt();
        /* a continuación, casteamos las variables nota1 y nota2 para que puedan
        contener decimales */
        media = (double) (nota1 + nota2) / 2;
        
        System.out.println("La media aritmética es: " + media);
    }
}
