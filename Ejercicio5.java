/**
 * Importamos la clase scanner que se encuentra en el paquete java util
 */
import java.util.Scanner;
public class Ejercicio5 {
    public static void main (String[] args){
        /**
         * Instanciamos un objeto de la clase scanner para poder leer en consola
         */
        Scanner scanner = new Scanner(System.in);

        /**
         * Definimos variables de tipo entero para almacenar datos y realizar los calculos
         */
        int numero;
        int siguienteNumero;

        /**
         * Pedimos los datos al usuario
         * Luego almacenamos el numero en la variable -numero-
         * Para luego sumar una unidad, esto será igual a la variable -siguienteNumero-
         */
        System.out.println("Bienvenido");
        System.out.println("----------------------------");
        System.out.println("Ingresa un numero");
        numero = scanner.nextInt();
        siguienteNumero = numero+1;

        /**
         * Imprimimos en pantalla
         */
        System.out.println("El numero que sigue despues de "+numero+" es "+siguienteNumero);
    }
}
