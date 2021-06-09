/**
 * Importamos la clase scanner del paquete java util
 */
import java.util.Scanner;
public class Ejercicio16 {
    public static void main(String[] args){
        /**
         * Instanciamos un objeto de la clase scanner para poder en consola los datos
         */
        Scanner scanner = new Scanner(System.in);

        /**
         * Declaramos variables donde se almacenaran los datos ingresados por el usuario
         */
        int numero1, numero2, numero3;

        /**
         * Almacenamos los datos ingresados por el usuario
         */
        System.out.println("Ingresa un numero");
        numero1 = scanner.nextInt();
        System.out.println("Ingresa un numero");
        numero2 = scanner.nextInt();
        System.out.println("Ingresa un numero");
        numero3 = scanner.nextInt();

        /**
         * Condicionales para definir cual de los tres numeros es el mas grande
         */
        if(numero1>numero2 && numero1>numero3){
            System.out.println("El numero mayor es: "+numero1);
        }
        else if(numero2>numero1 && numero2>numero3){
            System.out.println("El numero mayor es: "+numero2);
        }
        else if(numero3>numero1 && numero3>numero2){
            System.out.println("El numero mayor es: "+numero3);
        }
    }
}
