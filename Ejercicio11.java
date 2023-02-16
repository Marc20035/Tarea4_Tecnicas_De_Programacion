//Hazme un menu en el que el usuario pueda elegir el tamaño y el caracter que se usara para pintar la figura ASCII. El menu debe ser asi:
//1 - rectángulo con relleno 2 - rectángulo sin relleno 3 - cruz de San Andrés 4 - triángulo rectángulo 5 - rombo 6 - ajedrezado

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tamaño, opcion;
        char caracter;
        System.out.println("1 - rectángulo con relleno 2 - rectángulo sin relleno 3 - cruz de San Andrés 4 - triángulo rectángulo 5 - rombo 6 - ajedrezado");
        System.out.print("Escribe el número de la opción que quieres: ");
        opcion = sc.nextInt();
        System.out.print("Escribe el tamaño: ");
        tamaño = sc.nextInt();
        System.out.print("Escribe el carácter que quieres que se repita: ");
        caracter = sc.next().charAt(0);
        switch (opcion) {
            case 1:
                for (int i = 0; i < tamaño; i++) {
                    for (int j = 0; j < tamaño; j++) {
                        System.out.print(caracter);
                    }
                    System.out.println();
                }
                break;
            case 2:
                for (int i = 0; i < tamaño; i++) {
                    for (int j = 0; j < tamaño; j++) {
                        if (i == 0 || i == tamaño - 1 || j == 0 || j == tamaño - 1) {
                            System.out.print(caracter);
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
                break;
            case 3:
                for (int i = 0; i < tamaño; i++) {
                    for (int j = 0; j < tamaño; j++) {
                        if (i == j || i + j == tamaño - 1) {
                            System.out.print(caracter);
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
                break;
            case 4:
                for (int i = 1; i <= tamaño; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;

            
            case 5:
                    for (int i = 1; i <= tamaño; i++) {
                        for (int j = 1; j <= tamaño - i; j++) {
                            System.out.print(" ");
                        }
                        for (int k = 1; k <= i * 2 - 1; k++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    for (int i = tamaño - 1; i >= 1; i--) {
                        for (int j = 1; j <= tamaño - i; j++) {
                            System.out.print(" ");
                        }
                        for (int k = 1; k <= i * 2 - 1; k++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
        
                break;
            case 6:
            for (int i = 0; i < tamaño; i++) {
                for (int j = 0; j < tamaño; j++) {
                    if ((i+j)%2 == 0) {
                        System.out.print("#");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        
                break;
            default:
                System.out.println("Opción no válida");
            }

        }
    }
    




