/**
 * Importamos la clase scanner del paquete java util
 */
import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args){
        /**
         * Instanciamos un objeto de la clase scanner para poder leer en consola
         */
        Scanner scanner = new Scanner(System.in);

        /**
         * Generamos un numero aleatorio el cual casteamos para que se tome su valor entero
         * Luego reducimos en un 15% su valor, para almacenar este valor usamos una variable double
         */
        int numeroAleatorio = (int)(Math.random()*(50)+10);
        double numeroReducido = numeroAleatorio-(numeroAleatorio*0.15);

        /**
         * Mostramos en pantalla los resultados
         */
        System.out.println("El numero aleatorio es: "+numeroAleatorio);
        System.out.println("El numero reducido al 15% es: "+numeroReducido);
    }
}
