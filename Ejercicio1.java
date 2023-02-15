//Este algoritmo calcula la media de valores (por ejemplo, de las notas), introducidos por el usuario. En primer lugar, el usuario indica el número de valores cuyo promedio desea conocer. Seguidamente, introduce todos estos valores. Finalmente, se muestra la media de estos valores.

class Ejercicio1 {
    public static void main(String[] args) {
        int n, i;
        double suma, valor, media;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca el número de valores: ");
        n = teclado.nextInt();
        suma = 0;
        for (i = 1; i <= n; i++) {
            System.out.print("Introduzca el valor " + i + ": ");
            valor = teclado.nextDouble();
            suma = suma + valor;
        }
        media = suma / n;
        System.out.println("La media de los valores introducidos es " + media);
    }
}