/**
 * Importamos la clase scanner del paquete java util
 */
import java.util.Scanner;
public class Ejercicio11 {
    public static void main(String[] args){
        /**
         * Instanciamos un objeto de la clase scanner para poder leer en consola
         */
        Scanner scanner = new Scanner(System.in);

        /**
         * Declaracion de variables para almacenar medidas
         */
        double medidaCentimetros, medidaYardas, medidaPulgadas, medidaMetros;

        /**
         * El usuario ingresa una medida en centimetros, se almacena
         * Realizamos las conversiones correspondientes y se imprimen en pantalla los resultados
         */
        System.out.println("Ingresa una medida en centimetros");
        medidaCentimetros = scanner.nextDouble();

        medidaYardas = medidaCentimetros/94.4;
        medidaMetros = medidaCentimetros/100;
        medidaPulgadas = medidaCentimetros/2.54;
        System.out.println("La medida ingresada en yardas es de: "+medidaYardas);
        System.out.println("La medida ingresada en metros es de: "+medidaMetros);
        System.out.println("La medida ingresada en pulgadas es de: "+medidaPulgadas);
    }
}
