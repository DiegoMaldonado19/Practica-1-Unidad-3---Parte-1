/**
 * Importamos la clase Scanner del paquete java util
 */
import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[] args){
        /**
         * Instanciamos un objeto de la clase scanner para poder leer en consola
         */
        Scanner scanner = new Scanner(System.in);

        /**
         * Definimos las variables enteras que usaremos para almacenar y calcular los datos
         */
        int numero1, numero2, numero3, suma, promedio;

        /**
         * Se le dan instrucciones al usuario, y se almacenan los datos ingresados
         */
        System.out.println("Bienvenido");
        System.out.println("Con este programa podras calcular el promedio entre tres numeros");
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Ingrese un numero");
        numero1 = scanner.nextInt();
        System.out.println("Ingrese un numero");
        numero2 = scanner.nextInt();
        System.out.println("Ingrese un numero");
        numero3 = scanner.nextInt();

        /**
         * Calculamos la suma y con ella calculamos el promedio
         * Luego imprimimos el resultado en pantalla
         */
        suma = numero1+numero2+numero3;
        promedio = suma/3;
        System.out.println("El promedio de los tres numeros ingresados es: "+promedio);
    }
}
