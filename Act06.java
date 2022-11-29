package actividades.apoyo;

import java.util.Scanner;

/**
 * Este programa solicita un número por consola y te dice si es par o impar
 *
 * @author Adriano Díaz <Adriano.Díaz>
 */
public class Act06 {

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Inserte un número: ");
        num = sc.nextInt();
        if ((num % 2) == 0) {
            System.out.println("Ese número es par");
        } else {
            System.out.println("Ese número es impar");
        }
    }

}
