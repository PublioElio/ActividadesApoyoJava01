package actividades.apoyo;

import java.util.Scanner;

/**
 * Este programa solicita un número por consola y muestra su valor absoluto
 *
 * @author Adriano Díaz <Adriano.Díaz>
 */
public class Act08 {

    public static void main(String[] args) {
        int num, valorAbsoluto;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un número entero, "
                + "positivo o negativo: ");
        num = sc.nextInt();
        valorAbsoluto = num < 0 ? -num : num;
        // solución alternativa: absoluteValue = Math.abs(num);
        System.out.println("El valor absoluto de " + num + " es: "
                + valorAbsoluto);
    }
}
