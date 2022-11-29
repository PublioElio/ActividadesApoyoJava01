package actividades.apoyo;

import java.util.Scanner;

/**
 * Este programa calcula el salario de un empledo, introduciendo las horas que
 * ha trabajado esa semana
 *
 * @author Adriano Díaz <Adriano.Díaz>
 */
public class Act10 {

    public static void main(String[] args) {
        int salario, h, EUROS_HORA = 12;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el número de horas "
                + "trabajadas esta semana: ");
        h = sc.nextInt();
        salario = h * EUROS_HORA;
        System.out.printf("El salario de esta semana es: %d€\n",
                salario);
    }

}
