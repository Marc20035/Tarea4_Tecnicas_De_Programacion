//Esta vez, el ordenador debe adivinar un número elegido por el usuario. El usuario le indica si el número es mayor (+), menor (-) o si lo ha encontrado (=).

import java.util.Scanner;
import java.util.Random;

class Ejercicio5 {
    public static void main(String[] args) {
        int numero, intento;
        Random aleatorio = new Random();
        Scanner teclado = new Scanner(System.in);
        System.out.print("Piensa un número entre 1 y 100: ");
        numero = aleatorio.nextInt(100) + 1;
        System.out.print("¿Es el número " + numero + "? (si/no) ");
        String respuesta = teclado.nextLine();
        while (!respuesta.equals("si")) {
            if (respuesta.equals("no")) {
                System.out.print("¿Es mayor o menor? (+/-) ");
                String respuesta2 = teclado.nextLine();
                if (respuesta2.equals("+")) {
                    numero = aleatorio.nextInt(100) + 1;
                    System.out.print("¿Es el número " + numero + "? (si/no) ");
                    respuesta = teclado.nextLine();
                } else if (respuesta2.equals("-")) {
                    numero = aleatorio.nextInt(100) + 1;
                    System.out.print("¿Es el número " + numero + "? (si/no) ");
                    respuesta = teclado.nextLine();
                }
            }
        }
        System.out.println("¡He acertado!");
    }
}
