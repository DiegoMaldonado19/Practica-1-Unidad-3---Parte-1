/**
 * Importamos la clase scanner del paquete java util
 */
import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args){
        /**
         * Instanciamos un objeto de tipo scanner para poder leer archivos en consola
         */
        Scanner scanner = new Scanner(System.in);

        /**
         * Declaracion de variables double para realizar los calculos de enteros y decimales
         */
        Double numero;
        Double doble;
        Double triple;

        /**
         * Almacenamiento del numero ingresado por el usuario
         */
        System.out.println("Ingrese un numero");
        numero = scanner.nextDouble();

        /**
         * Calculamos el doble y el triple del numero en cuestion
         * Y mostramos en pantalla el resultado de las operaciones aritmeticas
         */
        doble = 2*numero;
        triple = 3*numero;

        System.out.println("El doble de "+numero+" es: "+doble);
        System.out.println("El triple de "+numero+" es: "+triple);
    }
}
