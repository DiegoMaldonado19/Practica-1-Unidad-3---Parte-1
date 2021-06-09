/**
 * Importamos clase scanner del paquete java util
 */
import java.util.Scanner;
public class Ejercicio20 {
    public static void main(String[] args){
        /**
         * Instanciamos un objeto de la clase scanner para poder leer los datos desde consola
         */
        Scanner scanner = new Scanner(System.in);

        /**
         * Declaramos variables para almacenar datos ingresados y cada digito
         */
        String numero, digito1, digito2, digito4, digito5;

        /**
         * Almancenamos la cadena ingresada por el usuario
         */
        System.out.println("Ingrese un numero de 5 cifras, sin espacios");
        numero = scanner.nextLine();

        /**
         * Dividimos la cadena y guardamos cada subcadena en cada variable
         */
        digito1 = numero.substring(0, 1);
        digito2 = numero.substring(1, 2);
        digito4 = numero.substring(3, 4);
        digito5 = numero.substring(4, 5);

        /**
         * Condicional para saber si el numero es capicua o no
         */
        if(digito1.equals(digito5) && digito2.equals(digito4)){
            System.out.println("El numero es capicua");
        }
        else{
            System.out.println("El numero no es capicua");
        }
    }
}
