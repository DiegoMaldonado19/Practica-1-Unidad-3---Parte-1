/**
 * Importamos la clase scanner del paquete java util
 */
import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args){
        /**
         * Instanciamos un objero de la clase scanner para poder leer los datos desde consola
         */
        Scanner scanner = new Scanner(System.in);

        /**
         * Variables donde almacenaremos las cadenas y luego las castearemos para poder sumar
         */
        String numero, digito1, digito2, digito3, digito4;
        int sumaDigitos;


        /**
         * El usuario ingresa el numero que se solicita
         */
        System.out.println("Ingresa un numero de cuatro digitos sin espacios");
        numero = scanner.nextLine();

        /**
         * Con el metodo substring de la clase string podemos separar la cadena 
         */
        digito1 = numero.substring(0, 1);
        digito2 = numero.substring(1, 2);
        digito3 = numero.substring(2, 3);
        digito4 = numero.substring(3, 4);
       
        /**
         * Castemaos cada subcadena para que sean enteros y los sumamos
         * Luego imprimimos el resultado en pantalla
         */
        sumaDigitos = Integer.parseInt(digito1)+Integer.parseInt(digito2)+Integer.parseInt(digito3)+Integer.parseInt(digito4);

        System.out.println("La suma de los digitos es: "+sumaDigitos);
    }
}
