/**
 * Importamos la clase scanner del paquete java util
 */
import java.util.Scanner;
public class Ejercicio14 {
    public static void main(String[] args){
        /**
         * Instanciamos un objeto de la clase scanner para poder leer datos desde consola
         */
        Scanner scanner = new Scanner(System.in);

        /**
         * Variables para almacenar los datos y poder satisfacer las condiciones
         */
        int numero1, numero2, resto;

        /**
         * El usuario ingresa los datos y se almacenan
         */
        System.out.println("Ingrese un numero");
        numero1 = scanner.nextInt();
        System.out.println("Ingrese un numero");
        numero2 = scanner.nextInt();

        /**
         * Se calcula el resto, esto nos servira para saber si son divisibles entre si
         */
        resto = numero1%numero2;

        /**
         * Condicional, donde si el resto es igual a cero los numeros son divisibles
         * Mientras que si el resto es diferente de cero los numeros no son divisibles entres si
         */
        if(resto==0){
            System.out.println("Los numeros son divisibles entres si");
        }
        else if(resto!=0){
            System.out.println("Los numeros no son divisibles entre si");
        }

    }
}
