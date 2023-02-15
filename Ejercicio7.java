//El programa debe mostrar un menú con una lista de películas y una opción para salir. Si el usuario elige una de las películas, el programa mostrará una cita de esa película. Luego, el usuario puede elegir otra película o salir. Si el usuario elige salir, el programa mostrará un mensaje antes de salir.

import java.util.Scanner;

class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("1. Fast and Furious");
            System.out.println("2. Star Wars");
            System.out.println("3. El padrino III");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("La velocidad es mi pasión..");
                    break;
                case 2:
                    System.out.println("Luke, I am your father");
                    break;
                case 3:
                    System.out.println("Just when I thought I was out, they pull me back in.");
                    break;
                case 4:
                    System.out.println("Hasta luego");
                    break;
                default:
                    System.out.println("Opción incorrecta");
            }
        } while (opcion != 4);
    }
}