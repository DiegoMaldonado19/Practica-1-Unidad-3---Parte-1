/**
 * Importamos la clase scanner del paquete java util
 */
import java.util.Scanner;
public class Ejercicio12 {
    public static void main(String[] args){
        /**
         * Instanciamos un objeto de la clase scanner para poder leer en consola
         */
        Scanner scanner = new Scanner(System.in);

        /**
         * Declaramos las variables donde se almacenaran los tipos de temperatura
         */
        double temperaturaCelsius, temperaturaFahrenheit;

        /**
         * El usuario ingresa una temperatura en grados celsius y se almacena
         * Luego se hace la conversion correspondiente, se almacena
         * Y se imprime el resutado de la misma en pantalla
         */
        System.out.println("Ingrese una temperatura en grados celsius");
        temperaturaCelsius = scanner.nextDouble();

        temperaturaFahrenheit = (temperaturaCelsius*(9/5))+32;
        System.out.println("La temperatura en grados fahrenheit es de: "+temperaturaFahrenheit);
    }
}
