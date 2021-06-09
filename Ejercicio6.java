/**
 * Importamos la clase scanner del paquete java util
 */
import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args){
        /**
         * Instanciamos un objeto de la clase scanner para poder leer datos desde consola
         */
        Scanner scanner = new Scanner(System.in);

        /**
         * La variable numeroAleatorio almacena un numero aleatorio generado por el sistema, el cual se castea,
         *      para que sea un int
         * La variable numeroAumentado almacena el valor de numeroAleatorio aumentado al 30%
         */
        int numeroAleatorio = (int)(Math.random()*(200)+1);
        double numeroAumentado = (numeroAleatorio*0.30)+numeroAleatorio;
        
        /**
         * Mostramos en pantalla el numero aleatorio y su valor aumentado un 30%
         */
        System.out.println("El numero aleatorio es: "+numeroAleatorio);
        System.out.println("El numero aleatorio aumentado al 30% es: "+numeroAumentado);

    }
}
