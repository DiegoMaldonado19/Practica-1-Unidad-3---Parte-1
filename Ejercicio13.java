/**
 * Importamos la clase scanner del paquete java util
 */
import java.util.Scanner;
public class Ejercicio13 {
    public static void main(String[] args){
        /**
         * Instanciamos un objeto de la clase scanner para poder leer datos desde consola
         */
        Scanner scanner = new Scanner(System.in);

        /**
         * Declaramos las variables para almacenar los datos
         */
        double radio, altura, volumen;

        /**
         * El usuario ingresa los datos de radio y altura, estos se almacenan
         */
        System.out.println("Ingresa el tamaño del radio del cilindro");
        radio = scanner.nextDouble();
        System.out.println("Ingresa el tamaño de la altura del cilindro");
        altura = scanner.nextDouble();

        /**
         * Condicional, donde si el radio y la altura son mayores que cero, se podra calcular el volumen
         * De lo contrario el usuario debe ingresar de nuevo los datos
         */
        if (radio>0 && altura>0){
            volumen = (Math.PI)*(radio*radio)*(altura);
            System.out.println("El volumen del cilindro es de: "+volumen);
        }
        else{
            System.out.println("Debes ingresar un numero mayor que cero");
        }

    }
}
