//Su algoritmo debe generar un número entero aleatorio entre 1 y 100. El usuario tiene que encontrar este número. Con cada intento del usuario, se le debe indicar si el número es mayor, menor o igual al valor introducido. El programa finaliza cuando el usuario ha encontrado el número.

import java.util.Scanner;
import java.util.Random;

class Ejercicio4 {
    public static void main(String[] args) {
        int numero, intento;
        Random aleatorio = new Random();
        Scanner teclado = new Scanner(System.in);
        numero = aleatorio.nextInt(100) + 1;
        System.out.print("Introduzca un número: ");
        intento = teclado.nextInt();
        while (intento != numero) {
            if (intento < numero) {
                System.out.println("El número es mayor");
            } else {
                System.out.println("El número es menor");
            }
            System.out.print("Introduzca un número: ");
            intento = teclado.nextInt();
        }
        System.out.println("¡Has acertado!");
    }

}
