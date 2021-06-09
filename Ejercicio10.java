/**
 * Importamos la clase scanner del paqueta java util
 */
import java.util.Scanner;
public class Ejercicio10 {
    public static void main(String[] args){
        /**
         * Instanciamos un objeto de la clase scanner para poder leer datos en consola
         */
        Scanner scanner = new Scanner(System.in);

        /**
         * Definimos las variables para poder hacer los calculos
         */
        double base, altura, perimetro, area;

        /**
         * El usuario ingresamos los datos y los almacenamos
         */
        System.out.println("Ingresa la base de tu rectangulo");
        base = scanner.nextDouble();
        System.out.println("Ingresa la altura de tu rectangulo");
        altura = scanner.nextDouble();

        /**
         * Calculamos perimetro y area
         * E imprimimos en pantalla sus valores
         */
        perimetro = (2*base)+(2*altura);
        area = base*altura;

        System.out.println("El perimetro del rectangulo es: "+perimetro);
        System.out.println("El area del rectangulo es: "+area);
    }
}
