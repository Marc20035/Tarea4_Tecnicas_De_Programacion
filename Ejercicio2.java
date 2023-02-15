//El objetivo sigue siendo realizar el cálculo de la media de un conjunto de valores introducidos por el usuario, pero el usuario ya no tiene que indicar inicialmente el número de valores. Introduce los valores y cuando ha terminado, introduce un valor concreto (-1), para indicar que ha terminado de introducir valores.
import java.util.Scanner;
class Ejercicio2 {
    public static void main(String[] args) {
        int i;
        double suma, valor, media;
        Scanner teclado = new Scanner(System.in);
        suma = 0;
        i = 0;
        System.out.print("¿nota?(-1 para terminar) " + (i + 1) + ": ");
        valor = teclado.nextDouble();
        while (valor != -1) {
            suma = suma + valor;
            i = i + 1;
            System.out.print("¿nota?(-1 para terminar) " + (i + 1) + ": ");
            valor = teclado.nextDouble();
        }
        media = suma / i;
        System.out.println("La media de los valores introducidos es " + media);
    }
}