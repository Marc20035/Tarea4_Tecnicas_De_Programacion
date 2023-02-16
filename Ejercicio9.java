
import java.util.Scanner;

class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        
        do {
            System.out.print("Escribe un número múltiplo de 3: ");
            numero = sc.nextInt();
            
        } while (numero % 3 != 0);
        System.out.println("El número es correcto.");
    }
}