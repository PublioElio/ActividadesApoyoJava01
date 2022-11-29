package actividades.apoyo;

import java.util.Scanner;

/**
 * Este programa hace una serie de preguntas al usuario, que tiene que responder
 * como 'true' or 'false'. En función de sus respuestas le confirma al usuario
 * si puede o no salir a la calle
 *
 * @author Adriano Díaz <Adriano.Díaz>
 */
public class Act07 {

    public static void main(String[] args) {
        boolean llueve, tareas, compra;
        Scanner sc = new Scanner(System.in);
        System.out.print("¿Está lloviendo? (true/false) ");
        llueve = sc.nextBoolean();
        System.out.print("¿Tienes tareas pendientes en casa? (true/false) ");
        tareas = sc.nextBoolean();
        System.out.print("¿Hay que ir a comprar? (true/false) ");
        compra = sc.nextBoolean();
        if ((llueve || tareas) && !compra) {
            System.out.println("Deberías quedare en casa :(");
        } else {
            System.out.println("Puedes salir esta tarde.");
        }
    }
}
