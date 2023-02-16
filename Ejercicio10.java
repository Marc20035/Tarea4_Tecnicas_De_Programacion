//Escriba un algoritmo que muestre un rectángulo realizado en arte ASCII según los deseos del usuario.


import java.util.Scanner;

class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ancho, alto;
        char caracter;
        System.out.print("Escribe el ancho del rectángulo: ");
        ancho = sc.nextInt();
        System.out.print("Escribe el alto del rectángulo: ");
        alto = sc.nextInt();
        System.out.print("Escribe el carácter que quieres que se repita: ");
        caracter = sc.next().charAt(0);
        for (int i = 0; i < alto; i++) {
            for (int j = 0; j < ancho; j++) {
                System.out.print(caracter);
            }
            System.out.println();
        }
    }
}