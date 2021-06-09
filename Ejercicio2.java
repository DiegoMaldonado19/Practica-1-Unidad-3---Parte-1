/** 
Importamos la clase Scanner del paquete java.util
*/
import java.util.Scanner;
public class Ejercicio2 {
    public static void main (String[] args){
        /**
        Declaramos el objeto scanner para leer datos en consola
         */
        Scanner scanner = new Scanner (System.in);

        /**
        Declaracion de variables para almacenar datos de pais y capital
         */
        String pais;
        String capital;

        /**
        Peticion de datos al usuario y almacenamiento de los mismos
         */
        System.out.println("Ingresa el nombre de tu pais");
        pais = scanner.nextLine();
        System.out.println("Ingresa la capital de tu pais");
        capital = scanner.nextLine();

        /**
        Mostramos en pantalla el pais y capital
         */
        System.out.println("Tu pais es "+pais+" y su capital es "+capital);
    }
}
