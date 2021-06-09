/**
 * Importamos la clase scanner del paquete java util
 */
import java.util.Scanner;
public class Ejercicio15 {
    public static void main(String[] args){
        /**
         * Instanciamos un objeto de la clase scanner para poder leer datos desde consola
         */
        Scanner scanner = new Scanner(System.in);

        /**
         * Declaramos variable donde almacenamos numero
         */
        int numero;

        /**
         * El usuario ingresa un dato y se almacena
         * Luego se aplica el condicional para saber su signo
         */
        System.out.println("Ingrese un numero");
        numero = scanner.nextInt();

        if(numero>0){
            System.out.println("El numero es positivo");
        }
        else if(numero<0){
            System.out.println("El numero es negativo");
        }
        else if(numero==0){
            System.out.println("El numero es nulo");
        }
    }
}
