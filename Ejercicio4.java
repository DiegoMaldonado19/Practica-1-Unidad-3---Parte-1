/**
 * Importamos la clase scanner del paquete java util
 */
import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args){
        /**
         * Instanciamos un objeto de la clase scanner para poder leer datos desde consola
         */
        Scanner scanner = new Scanner(System.in);

        /**
         * Declaramos variables de tipo int para poder almacenar el numero
         *  y posteriormente realizar los calculos
         */
        int numero;
        int cuadrado;
        int cubo;

        /**
         * Almacenamos los datos ingresados por el usuario
         */
        System.out.println("Bienvenido");
        System.out.println("-----------------------------");
        System.out.println("Ingresa un numero");
        numero = scanner.nextInt();

        /**
         * Realizamos los calculos para obtener su cuadrado y su cubo
         * Luego los mostramos en pantalla
         */
        cuadrado = numero*numero;
        cubo = numero*numero*numero;

        System.out.println("El cuadrado de "+numero+" es "+cuadrado);
        System.out.println("El cubo de "+numero+" es "+cubo);
    }
}
