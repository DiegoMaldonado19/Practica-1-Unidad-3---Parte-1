/**
 * Importamos la clase scanner del paquete java util
 */
import java.util.Scanner;
public class Ejercicio17 {
    public static void main(String[] args){
        /**
         * Instanciamos un objeto de la clase scanner para poder leer datos desde consola
         */
        Scanner scanner = new Scanner(System.in);

        /**
         * Declaramos las variables para almacenar los lados del triangulo
         */
        double lado1, lado2, lado3;

        /**
         * Se le dan instrucciones al usuario y se almacenan los datos
         */
        System.out.println("Bienvenido, con este programita sabras que tipo de triangulo tienes");
        System.out.println("Ingresa un lado");
        lado1 = scanner.nextDouble();
        System.out.println("Ingresa un lado");
        lado2 = scanner.nextDouble();
        System.out.println("Ingresa un lado");
        lado3 = scanner.nextDouble();

        /**
         * Condicionales para saber que tipo de triangulo ingreso el usuario
         */
        if(lado1==lado2 && lado1==lado3 && lado3==lado2){
            System.out.println("Tu triangulo es un triangulo equilatero");
        }
        else if(lado1!=lado2 && lado2!=lado3 && lado1!=lado3){
            System.out.println("Tu triangulo es un triangulo escaleno");
        }
        else{
            System.out.println("Tu triangulo es un triangulo isosceles");
        }
    }
}
