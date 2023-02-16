
import java.util.Random;

class Ejercicio8 {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        String[] frases = new String[5];
        frases[0] = "La vida es como andar en bicicleta. Para mantener el equilibrio, hay que seguir moviéndose.";
        frases[1] = "Vivir es fácil, lo difícil es soportar a la gente.";
        frases[2] = "Comer y dormir son las únicas cosas que hacemos bien. El resto es una pérdida de tiempo.";
        frases[3] = "Leer es como viajar por el tiempo.";
        frases[4] = "Dormir es la mejor parte del día.";
        int numero = aleatorio.nextInt(5);
        System.out.println(frases[numero]);
    }
}