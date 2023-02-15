//Modificar el algoritmo anterior para mostrar además el porcentaje de notas superiores a 10/20.
import java.util.Scanner;
class Ejercicio3 {
    public static void main(String[] args) {
        int i;
        double suma, valor, media, porcentaje;
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
        porcentaje = (i / suma) * 100;

        System.out.println("La media de los valores introducidos es " + media);
        System.out.println("El porcentaje de notas superiores a 10/20 es " + porcentaje + "%");
    }
}